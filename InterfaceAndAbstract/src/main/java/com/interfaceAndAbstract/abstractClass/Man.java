package com.interfaceAndAbstract.abstractClass;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:54
 * @Version 1.0
 *
 * 抽象类的继承类
 */
public class Man extends Person{

    //继承抽象类必须实现抽象方法，否则需要将自己也定义为抽象类
    @Override
    protected void sleep() {
        System.out.println("男人需要更多的睡眠");
    }
}
