package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，饿汉模式
 */
public class Singleton5 {
    private static Singleton5 singleton = new Singleton5();

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton5() {
    }

    /**
     * 使用静态内部类来实现单例，解决线程安全问题以及性能问题
     *
     * @return 单例对象
     */
    public static Singleton5 getInstance() {
        return singleton;
    }
}
