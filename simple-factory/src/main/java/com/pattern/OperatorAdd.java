package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:39
 * @desc 加法操作类
 */
public class OperatorAdd implements Operator{

    public BigDecimal calculate(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
