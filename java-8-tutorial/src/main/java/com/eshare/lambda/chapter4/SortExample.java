package com.eshare.lambda.chapter4;

import com.eshare.lambda.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结合排序使用
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class SortExample {

    public static void main(String[] args) {
        //排序，使用lambda表达式代替Comparator代替compareTo方法
        Person[] persons = {new Person("王八", 8), new Person("王五", 5), new Person("王六", 6)};
        System.out.println("排序前:" + Arrays.toString(persons));
        Arrays.sort(persons, Person::nameCompate);
        System.out.println("排序后:" + Arrays.toString(persons));
    }

}
