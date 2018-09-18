package com.fei.dao;

import java.util.List;

import com.fei.entity.Order;
import com.fei.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.StringUtils;
import org.springframework.transaction.annotation.Transactional;

@Repository
//实现事务
@Transactional(readOnly = false,rollbackFor = Throwable.class)
public class OrderDao {

    @Autowired
    private OrderRepository orderRepository;

    /**
     * 获取全部
     * 
     * @return
     */
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * 持久化
     * 
     * @param entity
     * @return
     */
    public void save(Order entity) throws Exception {
        // 持久化
        orderRepository.save(entity);
        // 如果持久化成功，就抛出异常。如果开启事务，那么刚才持久化的数据应回滚
    }
}