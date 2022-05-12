package com.interfaceAndAbstract.interfacce;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:42
 * @Version 1.0
 */
public class Bird implements AnimalBehavior{

    @Override
    public void shout() {
        System.out.println("鸟儿发出叫声...");
    }

    @Override
    public void reproduction() {
        System.out.println("鸟儿进行繁殖...");
    }

}
