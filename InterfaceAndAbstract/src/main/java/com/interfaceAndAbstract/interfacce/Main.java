package com.interfaceAndAbstract.interfacce;

/**
 * @Author Chengzhi
 * @Date 2022/5/12 13:44
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AnimalBehavior animalBehavior = new Bird();
        animalBehavior.shout();
        //通过实现类调用接口的默认方法
        animalBehavior.eat();
        //调用接口的静态方法
        AnimalBehavior.drink();
        //调用接口中的常量
        System.out.println("接口中没有变量只有常量：" + AnimalBehavior.num);
    }
}
