package com.fei.demo;

/**
 * @author fengzf fengzf@gstarcad.com
 * @version Vxxx (项目版本)
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @date 2019/12/2 15:33
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 15:33
 */
public interface Whistle {

    default void print(){
        System.out.println("我要鸣笛");
    }

    static void horn(){
        System.out.println("按喇叭~");
    }
}
