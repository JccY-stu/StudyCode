package com.yang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

public class Person {
    /**使用@Autowired：
     *      可直接在属性上使用，也可以在set方法上使用
     *      @Autowired(required = false)允许该对象为空不报错
     *      @Qualifier(value = "dog111")如果Autowired自动壮瞥的环境比较复杂，自动装配无法通过一个注解完成的时候，可以使用Qualifier(value="")注解配合使用,指定一个唯一的对象注入
     * 使用@Nullable
     *      允许为空不报错
     * 使用@Resource
     *      更加强大
     */
    /**总结：
     *@Autowired和@Resource的区别
     * 1.都是用来自动装配的，都可以放在属性字段上；
     * 2.@Autowired通过byType的方式实现，如果找不到名字就通过byname实现，而且必须要求对象存在；
     * 3.@Resource通过byname的方式实现，如果找不到名字则通过byType实现，如果两个都找不到的情况下就报错；
     * 4.执行顺序不同，@Autowired先用byType，@Resource先用byname；
     */
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }


    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
