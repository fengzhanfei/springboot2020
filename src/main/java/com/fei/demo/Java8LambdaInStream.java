package com.fei.demo;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2019/12/2 15:09
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/12/2 15:09
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: Java8LambdaInStream.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2019/12/2 15:09
 *
 */
public class Java8LambdaInStream {

     public static void main(String args[]) {
         List<Person> personList = new ArrayList<Person>(){
             {
                 add(new Person("张三",24));
                 add(new Person("李四",32));
                 add(new Person("王五",28));
                 add(new Person("赵六",26));
                 add(new Person("赵七",30));
             }
         };

         //使用Stream和Lambda对personList进行排序
         List<Person> sortedList = personList.stream()
                 .sorted(Comparator.comparingInt(p -> p.age))
                 .limit(5).collect(Collectors.toList());

           System.out.println(sortedList);
      }
}
