package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，懒汉模式，线程安全
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static Singleton4 SINGLETON_HOLDER = new Singleton4();
    }

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton4() {
    }

    /**
     * 使用静态内部类来实现单例，解决线程安全问题以及性能问题
     *
     * @return 单例对象
     */
    public static Singleton4 getInstance() {
        return SingletonHolder.SINGLETON_HOLDER;
    }
}
