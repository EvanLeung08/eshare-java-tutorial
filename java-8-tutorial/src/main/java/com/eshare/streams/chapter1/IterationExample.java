package com.eshare.streams.chapter1;

import java.util.Arrays;
import java.util.List;

/**
 * IterationExample
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class IterationExample {

    public static void main(String[] args) {
        List<String> alphabets = Arrays.asList(new String[]{"a", "b", "c", "d"});
        alphabets.forEach(x->{
            System.out.println(x.toUpperCase());
        });
    }
}
