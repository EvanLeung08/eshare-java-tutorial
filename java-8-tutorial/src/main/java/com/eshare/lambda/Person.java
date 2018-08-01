package com.eshare.lambda;

import com.eshare.functioninterface.chapter1.MyFuntinoalInterface1;

/**
 * Person
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static int nameCompate(Person p1, Person p2) {
        return p1.age.compareTo(p2.age);
    }

    public void eat(MyFuntinoalInterface1 myFuntinoalInterface) {
        myFuntinoalInterface.eat();
    }

    @Override
    public String toString() {
        return name;
    }
}
