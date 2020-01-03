package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 10:54
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 10:54
 */

/**
 * @ClassName: Java8LambdaScopeDemo.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 10:54
 *
 */
public class Java8LambdaScopeDemo {
     public static void main(String args[]) {
         final String salutation = "hello ";
         String myName = "I am Lambda ~";
         String today = "2019/12/02";
         SayHello greetingService = message -> {
             System.out.println(salutation + message + myName);
             //此处修改today出现变异错误
             //today = "2019/12/03";
             //此处定义的局部变量会出现编译错误
             //String myName = "Java";
         };

         greetingService.say("World ! ");
      }
     interface SayHello{
         /**
          * 打招呼方法
          * @param message
          */
         void say(String message);

     }
}
