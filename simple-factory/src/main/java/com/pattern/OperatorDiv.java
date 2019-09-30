package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:42
 * @desc 除法操作类
 */
public class OperatorDiv implements Operator{

    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.divide(b, BigDecimal.ROUND_FLOOR);
    }
}
