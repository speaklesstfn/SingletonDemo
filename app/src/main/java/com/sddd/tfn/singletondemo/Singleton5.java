package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，饿汉模式
 */
public class Singleton5 {
    private String name = "";
    private static Singleton5 singleton = new Singleton5();

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton5() {
    }

    /**
     * 使用类初始化的方式来创建单例
     *
     * @return 单例对象
     */
    public static Singleton5 getInstance() {
        return singleton;
    }

    /**
     * 设置名称
     *
     * @param name 要设置的名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取名称
     *
     * @return 所设置的名称
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "name is " + this.name + "  address is " + super.toString();
    }
}
