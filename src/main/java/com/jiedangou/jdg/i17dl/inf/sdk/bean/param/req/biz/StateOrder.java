package com.jiedangou.jdg.i17dl.inf.sdk.bean.param.req.biz;

import com.jiedangou.jdg.i17dl.inf.sdk.bean.param.pro.OMessage;

/**
 * Created on 2017/12/23
 *
 * @author Jianghao(howechiang @ gmail.com)
 */
public class StateOrder {

    private String orderNum;

    private OMessage om;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public OMessage getOm() {
        return om;
    }

    public void setOm(OMessage om) {
        this.om = om;
    }

    public StateOrder(String orderNum, OMessage om) {
        this.orderNum = orderNum;
        this.om = om;
    }

    public StateOrder() {
    }
}
