package com.interfaceAndAbstract.abstractClass;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:49
 * @Version 1.0
 *
 * 定义一个抽象类
 * 用于对比接口和抽象类
 */
public abstract class Person {

    //抽象类可以有变量、属性、方法、构造方法等
    int a = 100;
    Integer b;
    public void Person(){
        System.out.println("我是一个构造方法");
    }
    //成员方法
    void say() {
        System.out.println("人类会说话噢");
    }

    //抽象类可以没有抽象方法，但是有抽象方法必须是抽象类
    //抽象方法的修饰符只能是protected 或 public
    protected abstract void sleep();
}
