package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 10:32
 * @desc ConcreteDecoratorB
 */
public class BigTrouser extends Decorator {

    private Component person;

    public void decorator(Component component){
        person = component;
    }

    @Override
    public void show() {
        System.out.println("垮裤");
        person.show();
    }
}
