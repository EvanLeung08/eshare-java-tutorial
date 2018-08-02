package com.eshare.methodreferences.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 构造器方法引用示例
 * Created by liangyh on 2018/8/2.
 * Email:10856214@163.com
 */
public class ConstructorMethodExample {

    public static void main(String[] args){
        //引用构造器方法
        List<Integer> integers = IntStream.range(1,100).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(integers);
    }
}
