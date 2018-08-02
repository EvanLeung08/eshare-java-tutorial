package com.eshare.methodreferences.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 静态方法引用示例
 * Created by liangyh on 2018/8/2.
 * Email:10856214@163.com
 */
public class StaticMethodExample {

    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(11,23,10,2);
        Optional<Integer> max =integers.stream().reduce(Math::max);
        max.ifPresent(value -> System.out.println(value));
    }
}
