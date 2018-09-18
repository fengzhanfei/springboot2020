package com.fei.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fei.dao.OrderDao;
import com.fei.entity.Order;
import com.fei.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fengzf fengzf@gstarcad.com
 * @MethodName:
 * @@Description: 
 * @params  
 * @return 
 * @Date:  2018/9/18 13:57 
 */  
@Controller
public class MainController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 处理日期类型
     * 
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 持久化
     * 
     * @param entity
     * @return
     */
    @PostMapping("/save")
    public @ResponseBody Map<String, Object> save(@RequestBody Order entity) {
        Map<String, Object> result = new HashMap<>();
        try {
            orderDao.save(entity);
            result.put("success", true);
        } catch (Exception e) {
            result.put("success", false);
        }
        return result;
    }

    /**
     * 获取全部
     * 
     * @return
     */
    @PostMapping("/findAll")
    public @ResponseBody Object findAll() {
        return orderDao.findAll();
    }

}

