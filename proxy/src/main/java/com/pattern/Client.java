package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 11:34
 * @desc 客户端
 */
public class Client {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Client client = new Client("客户");
        Proxy proxy = new Proxy(client);
        proxy.giveGift();
    }
}
