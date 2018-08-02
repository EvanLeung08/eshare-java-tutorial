package com.eshare.methodreferences.chapter2;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 实例方法引用示例
 * Created by liangyh on 2018/8/2.
 * Email:10856214@163.com
 */
public class InstantMethodExample {
    public static void main(String[] args){
        List<Integer> integers = Arrays.asList(11,23,10,2);
        Optional<Integer> max =integers.stream().reduce(Math::max);
        //引用PrintStream实例方法打印
        max.ifPresent(System.out::println);
        //引用Integer实例方法compareTo
        List<Integer> sorted =integers.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.print(sorted);
    }
}
