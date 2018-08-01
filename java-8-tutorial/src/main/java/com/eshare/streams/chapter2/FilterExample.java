package com.eshare.streams.chapter2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * FilterExample
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class FilterExample {

    public static void main(String[] args) {
        String prefix = "王";
        List<String> items = new ArrayList<>();
        items.add("王五");
        items.add("王六");
        items.add("梁五");
        items.add("梁六");
        //过滤姓王的人
        items = items.stream().filter(e->(!e.contains(prefix))).collect(Collectors.toList());
        System.out.println(items);
    }
}
