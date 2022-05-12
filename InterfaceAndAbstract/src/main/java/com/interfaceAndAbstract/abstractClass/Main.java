package com.interfaceAndAbstract.abstractClass;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:55
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //Person person = new Person();

        Man man = new Man();
        man.a = 50;
        man.say();
        System.out.println(man.a);
        System.out.println(man.b);
    }
}
