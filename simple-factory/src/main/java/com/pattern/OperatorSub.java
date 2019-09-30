package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:40
 * @desc 减法操作类
 */
public class OperatorSub implements Operator {
    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }
}
