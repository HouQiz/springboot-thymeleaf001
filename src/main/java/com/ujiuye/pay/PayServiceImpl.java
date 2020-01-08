package com.ujiuye.pay;

public class PayServiceImpl implements PayService {
    @Override
    public void add(Double price) {
        System.out.println("支付增加");
    }

    @Override
    public void update9(Integer id) {
        System.out.println("支付修改");
    }
}
