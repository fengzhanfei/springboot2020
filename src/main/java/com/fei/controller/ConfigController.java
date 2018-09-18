package com.fei.controller;/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description:
 * @author fengzf fengzf@gstarcad.com
 * @date 2018/9/18 15:17
 * @version Vxxx (项目版本)
 * @redmine
 * @update @Description TODO(这里用一句话描述这个方法的作用)
 * @update @author fengzf fengzf@gstarcad.com
 * @update @date 2018/9/18 15:17
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.core.env.Environment;

/**
 * @ClassName: PropertiesAction.java
 * @Description:
 * @author: fengzf fengzf@gstarcad.com
 * @Date: 2018/9/18 15:17
 *
 */
@RestController
public class ConfigController {
    @Autowired
    private Environment env;
    /**
     * 通过配置的key获取value<br>
     * {key:.+}是为了解决通过url参数访问的时候小数点丢失的问题
     * @param key
     * @return
     */
    @RequestMapping("/config/{key:.+}")
    Object getConfig(@PathVariable String key) {
        return env.getProperty(key);
    }
}
