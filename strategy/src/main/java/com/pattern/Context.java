package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 10:02
 * @desc 上下文
 */
public class Context {

    private Strategy strategy;


    //结合简单工厂模式
    public Context(StrategyType type) {
        switch (type){
            case DISCOUNT: this.strategy = new DiscountStrategy(); break;
            case GIFT: this.strategy = new GiftStrategy(); break;
        }
    }

    public void executeStrategy(){
        if(strategy != null)
            strategy.algorithm();
    }

    public static void main(String[] args) {
        Context context = new Context(StrategyType.DISCOUNT);
        context.executeStrategy();

    }
}
