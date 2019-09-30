package com.pattern;

import java.math.BigDecimal;

/**
 * @author egan
 * @date 2019/9/30 9:37
 * @desc 计算器接口
 */
public interface Operator {

    BigDecimal calculate(BigDecimal a, BigDecimal b);

}
