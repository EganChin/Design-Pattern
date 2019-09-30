package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 10:32
 * @desc ConcreteDecoratorA
 */
public class TShirt extends Decorator {

    private Component person;

    public void decorator(Component component){
        person = component;
    }

    @Override
    public void show() {
        System.out.println("T恤");
        person.show();
    }
}
