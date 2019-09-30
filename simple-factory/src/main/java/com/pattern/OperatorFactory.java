package com.pattern;


import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:35
 * @desc 计算工厂
 * 根据输入运算符，提供计算方法类
 */
public class OperatorFactory {

    public static Operator createOperator(OperatorSymbol symbol){
        switch (symbol){
            case ADD: return new OperatorAdd();
            case SUB: return new OperatorSub();
            case MUL: return new OperatorMul();
            case DIV: return new OperatorDiv();
            default:
                throw new RuntimeException("不支持的操作符");
        }
    }

    public static void main(String[] args) {
        Operator operator = OperatorFactory.createOperator(OperatorSymbol.ADD);
        System.out.println(operator.calculate(new BigDecimal(1), new BigDecimal(2)));
    }

}
