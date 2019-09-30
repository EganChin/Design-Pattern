package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 10:24
 * @desc Component
 */
public class Component {

    private String name;

    public Component() {
    }

    public Component(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + ":服装展示");
    }


    public static void main(String[] args) {
        Component person = new Component("模特");
        BigTrouser bigTrouser = new BigTrouser();
        TShirt tShirt = new TShirt();

        bigTrouser.decorator(person);
        tShirt.decorator(bigTrouser);
        tShirt.show();
    }
}
