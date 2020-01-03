package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 14:30
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 14:30
 */

/**
 * @ClassName: Java8LambdaInThreadDemo.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 14:30
 *
 */
public class Java8LambdaInThreadDemo {

     public static void main(String args[]) {
           //不使用Lambda，使用匿名类
         new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("线程1");
             }
         }).start();

         //使用lambda表达式
         new Thread(()-> System.out.println("线程2")).start();
      }


}
