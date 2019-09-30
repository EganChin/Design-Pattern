package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 11:34
 * @desc Proxy所代表的真实实体
 */
public class RealSubject implements Subject {

    private Client client;

    public RealSubject(Client client) {
        this.client = client;
    }

    public void giveGift() {
        System.out.println("给" + client.getName() + "送礼");
    }
}
