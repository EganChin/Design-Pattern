package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 13:48
 * @desc
 */
public class StudentFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Student();
    }
}
