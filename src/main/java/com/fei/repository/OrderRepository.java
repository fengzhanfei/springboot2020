package com.fei.repository;

import com.fei.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * @Author: fengzf fengzf@gstarcad.com
 * @MethodName:
 * @@Description:
 * @params
 * @return
 * @Date:  2018/9/18 13:55
 */
public interface OrderRepository extends JpaRepository<Order, String> {

    /**
     * like查询
     *
     * @param no
     * @return
     */
    List<Order> findAllByNoLike(String no);

    /**
     * between查询
     *
     * @param startDate
     * @param endDate
     * @return
     */
    List<Order> findAllByDateBetween(Date startDate, Date endDate);

    /**
     * 小于查询
     *
     * @param quantity
     * @return
     */
    List<Order> findAllByQuantityLessThan(int quantity);

}