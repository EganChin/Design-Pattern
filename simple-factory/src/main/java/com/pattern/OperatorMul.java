package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:41
 * @desc 乘法操作类
 */
public class OperatorMul implements Operator {
    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
