package com.fei.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * @Author: fengzf fengzf@gstarcad.com
 * @MethodName:
 * @@Description: 
 * @params  
 * @return 
 * @Date:  2018/9/18 13:44 
 */
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "order_id", length = 36)
    public String id;

    @Column(name = "order_no", length = 50)
    public String no;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date")
    public Date date;

    @Column(name = "quantity")
    public int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

