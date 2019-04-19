package com.fei.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author fengzf fengzf@gstarcad.com
 * @version Vxxx (项目版本)
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @date 2019/4/19 16:18
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2019/4/19 16:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtherPropertiesTest {
    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testOther() throws Exception {
        System.out.println("title:"+otherProperties.getTitle());
        System.out.println("blog:"+otherProperties.getBlog());
    }

}