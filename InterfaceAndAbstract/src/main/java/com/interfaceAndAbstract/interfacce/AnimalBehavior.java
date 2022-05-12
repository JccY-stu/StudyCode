package com.interfaceAndAbstract.interfacce;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:36
 * @Version 1.0
 *
 * 定义一个接口
 * 用于对比接口和抽象类
 */
public interface AnimalBehavior {

    //接口中无变量，只有常量，默认 public static final
    int num = 10;

    /**
     * 发出叫声
     */
    //接口中的抽象方法
    public abstract void shout();

    /**
     * 进行繁殖
     */
    void reproduction();

    //JDK1.8之后，允许默认方法存在
    //可以不被实现，但想调用的话，必须通过实现类来调用，不能通过接口调用
    default void eat() {
        System.out.println("动物当然要吃"+ num + "份儿东西");
    }
    //JDK1.8之后，允许静态方法存在
    //只允许通过 接口.方法名 调用 AnimalBehavior.drink
    static void drink() {
        System.out.println("静态方法：动物也需要喝水");
    }
}
