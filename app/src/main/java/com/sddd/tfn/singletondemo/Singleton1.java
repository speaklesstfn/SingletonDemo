package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，懒汉模式，线程不安全
 */
public class Singleton1 {
    //由于获取单例对象方法为static，因此singletion1变量也需定义成静态
    private static Singleton1 singleton1 = null;

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton1() {
    }

    /**
     * 为了保证通过类名来调该方法，需要将方法定义为static
     *
     * @return 单例对象
     */
    public static Singleton1 getInstance() {
        if (null == singleton1) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
