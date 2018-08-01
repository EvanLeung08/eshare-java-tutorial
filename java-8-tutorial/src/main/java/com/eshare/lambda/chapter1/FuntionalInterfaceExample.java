package com.eshare.lambda.chapter1;

import com.eshare.lambda.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结合FuntionalInterface演示
 * @author liangyh
 * @date 2018/7/31
 */
public class FuntionalInterfaceExample {

    public static void main(String[] args) {
        //配合默认接口使用,使用lambda表达式代替MyFuntinoalInterface的唯一抽象方法
        new Person().eat(() -> System.out.println("正在吃饭"));

    }

}
