package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 10:18
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 10:18
 */

/**
 * @ClassName: Java8LambdaDemo.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 10:18
 *
 */
public class Java8LambdaDemo {

     public static void main(String args[]) {
         Java8LambdaDemo java8LambdaDemo = new Java8LambdaDemo();
        //类型声明
         Calculator addtion = (int a,int b) ->a+b;
         //不用类型声明
         Calculator subtraction = (a,b) -> a-b;
         //大括号的返回语句
         Calculator multiplication = (int a,int b) -> {return a*b; };
         //没有大括号的返回语句
         Calculator division = (int a,int b) -> a/b;

         System.out.println("100+50="+java8LambdaDemo.operate(100,50,addtion));
         System.out.println("100-50="+java8LambdaDemo.operate(100,50,subtraction));
         System.out.println("100*50="+java8LambdaDemo.operate(100,50,multiplication));
         System.out.println("100/50="+java8LambdaDemo.operate(100,50,division));
      }

    /**
     * 算数运算接口
     */
    interface  Calculator{
         int  calculate(int a,int b);
    }

    /**
     *操作方法
     */
    private int operate(int a,int b,Calculator calculator){
        return calculator.calculate(a,b);
    }
}
