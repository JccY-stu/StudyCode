package com.interfaceAndAbstract.interfacce;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:43
 * @Version 1.0
 */
public class fish implements AnimalBehavior{
    @Override
    public void shout() {
        System.out.println("鱼不会叫啊...");
    }

    @Override
    public void reproduction() {
        System.out.println("鱼进行繁殖...");
    }
}
