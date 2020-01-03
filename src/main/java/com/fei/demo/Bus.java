package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 15:35
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 15:35
 */

/**
 * @ClassName: Bus.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 15:35
 *
 */
public class Bus implements Vehicle,Whistle{

    @Override
    public void print(){
        System.out.println("我是一辆巴士");
    }
    @Override
    public void drive() {
        System.out.println("开一辆巴士");
    }

     public static void main(String args[]) {
         Bus bus = new Bus();
         bus.print();
         bus.drive();
         Whistle.horn();
      }
}
