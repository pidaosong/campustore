package com.ljq.cs.dao;

import com.ljq.cs.entity.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 支付方式 DAO 接口
 * @author: lujunqiang
 * @date: 2017/12/17
 */
@Repository
public interface PaymentDao {

    //	添加支付方式
    boolean addOne(Payment payment);
    //	删除支付方式
    boolean delOne(Payment payment);
    //	查询所有的支付方式
    List queryAll();
    //	查询一种支付方式
    Payment queryOne(Payment pay);


}
