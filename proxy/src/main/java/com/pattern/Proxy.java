package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 11:34
 * @desc 代理
 */
public class Proxy implements Subject{

    private RealSubject realSubject;


    public Proxy(Client client) {
        realSubject = new RealSubject(client);
    }


    public void giveGift() {
        realSubject.giveGift();
    }
}
