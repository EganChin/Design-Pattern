package com.pattern;

/**
 * @author egan
 * @date 2019/9/30 13:50
 * @desc
 */
public class LeiFengFactory {
    public static Factory createFacotry(String name) {
        try {
            Class clz = Class.forName(name);
            return (Factory) clz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("[" + name + "]不存在");
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("实例化失败");
    }

    public static void main(String[] args) {
        Factory volunteerFactory = LeiFengFactory.createFacotry("com.pattern.VolunteerFactory");
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        volunteer.sweep();

        Factory studentFactory = LeiFengFactory.createFacotry("com.pattern.StudentFactory");
        LeiFeng student = studentFactory.createLeiFeng();
        student.buyRice();
    }
}
