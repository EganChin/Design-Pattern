package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 13:48
 * @desc
 */
public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
