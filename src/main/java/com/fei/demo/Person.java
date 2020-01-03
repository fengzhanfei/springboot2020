package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 14:50
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 14:50
 */

/**
 * @ClassName: Person.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 14:50
 *
 */
public class Person {
    /**
     * 姓名
     */
    public String name;

    /**
     * 年龄
     */
    public int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name+":"+this.age;
    }
}
