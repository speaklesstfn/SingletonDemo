package com.sddd.tfn.singletondemo;

/**
 * Created by xiadaidai on 2016/12/6.
 * Modified by xiadaidai
 * 单例模式，懒汉模式，线程安全
 */
public class Singleton3 {
    //由于获取单例对象方法为static，因此singletion3变量也需定义成静态
    //定义为volatile，解决因为java的无序写入导致的得到了正确的单例对象引用，但是成员变量值不正确的问题
    private static volatile Singleton3 singleton3 = null;
    private String name = "";

    /**
     * 为了防止外部类通过构造方法获取对象，需要将构造方法定义成private
     */
    private Singleton3() {
    }

    /**
     * 使用双重检查锁定（Double Check Lock，简称DCL）
     *
     * @return 单例对象
     */
    public static Singleton3 getInstance() {
        if (null == singleton3) {
            synchronized (Singleton3.class) {
                if (null == singleton3) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
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
