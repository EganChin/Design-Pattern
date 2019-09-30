package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:51
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Operator operator = OpearatorFactory.createOperator(OperatorSymbol.ADD);
        System.out.println(operator.calculate(new BigDecimal(1), new BigDecimal(2)));
    }
}
