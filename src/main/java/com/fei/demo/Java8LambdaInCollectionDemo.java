package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 14:55
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 14:55
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: Java8LambdaInCollectionDemo.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 14:55
 *
 */
public class Java8LambdaInCollectionDemo {

     public static void main(String args[]) {
         List<Person> personList = new ArrayList<>();
         Person personLi = new Person("李四",22);
         Person personZhang = new Person("张三",20);
         Person personWang = new Person("王五",26);
         personList.add(personLi);
         personList.add(personZhang);
         personList.add(personWang);

         //按年龄从小到大排序
         Collections.sort(personList, new Comparator<Person>() {
             @Override
             public int compare(Person o1, Person o2) {
                 return o1.age - o2.age;
             }
         });
         System.out.println(personList);

         //使用Lambda表达式，按年龄从大到小排序
         Collections.sort(personList,(o1,o2) -> o2.age - o1.age);

         System.out.println(personList);

         //使用Lambda表达式，按年龄从小到大排序
         Collections.sort(personList,Comparator.comparingInt(o -> o.age));

         System.out.println(personList);
      }
}
