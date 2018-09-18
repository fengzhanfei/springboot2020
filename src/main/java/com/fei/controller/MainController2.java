package com.fei.controller;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2018/9/18 15:35
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2018/9/18 15:35
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MainController2.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2018/9/18 15:35
 *
 */
@RestController
public class MainController2 {

    /**
     * 读取application.properties中的配置值
     */
    @Value("${server.context-path}")
    private String contextPath;
    @RequestMapping("/config/contextpath")
    Object getConfigContextPath() {
        return contextPath;
    }
}
