package com.fei.demo;

/**
 * @author fengzf fengzf@gstarcad.com
 * @version Vxxx (项目版本)
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @date 2019/12/2 15:26
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 15:26
 */
public interface Vehicle {

    /**
     * 默认方法
     */
    default void print(){
        System.out.println("我是一辆车!");
    }

    /**
     * 抽象方法
     */
    void drive();
}
