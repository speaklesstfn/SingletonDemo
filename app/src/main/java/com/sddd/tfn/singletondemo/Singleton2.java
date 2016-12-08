package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，懒汉模式，线程安全
 */
public class Singleton2 {
    //由于获取单例对象方法为static，因此singletion2变量也需定义成静态
    private static Singleton2 singleton2 = null;
    private String name = "";

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton2() {
    }

    /**
     * 为了保证通过类名来调该方法，需要将方法定义为static
     * 为了解决Singleton1线程不安全的问题，使用synchronized进行方法同步
     *
     * @return 单例对象
     */
    public static synchronized Singleton2 getInstance() {
        if (null == singleton2) {
            singleton2 = new Singleton2();
        }
        return singleton2;
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
