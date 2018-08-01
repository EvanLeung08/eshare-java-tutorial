package com.eshare.lambda.chapter3;

import com.eshare.lambda.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结合列表使用
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class ListExample {

    public static void main(String[] args) {
        //列表使用,使用lambda表达式代替Consumer<? super T>的唯一抽象方法
        List<String> nameList = new ArrayList<>();
        nameList.add("张三");
        nameList.add("李四");
        nameList.forEach(p -> {
            System.out.println(p);
        });
    }

}
