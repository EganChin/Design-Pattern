package com.pattern;

import static com.pattern.OperatorSymbol.*;

/**
 * @author egan
 * @date 2019/9/30 9:35
 * @desc 计算工厂
 * 根据输入运算符，提供计算方法类
 */
public class OpearatorFactory {

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

}
