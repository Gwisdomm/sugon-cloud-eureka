package com.sugon.gaowz.service.impl;

import com.sugon.gaowz.dao.PaymentDao;
import com.sugon.gaowz.service.IPaymentService;
import com.sugon.gaowz.domain.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: tx_springcloud_02
 * @description: 支付接口的业务层实现类
 * @author: gaowz
 * @create: 2020-11-13 15:45
 **/
@Service
public class PaymentServiceImpl implements IPaymentService {


    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = paymentDao.getPaymentById(id);
        return payment;
    }

    @Override
    public int addPayment(Payment payment) {
        int i = paymentDao.addPayment(payment);
        return i;
    }
}
