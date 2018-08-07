package com.eshare.joinarray.chapter1;



import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * JoinArrayExample
 *
 * @author liangyh
 * @date 2018/8/7
 */
public class JoinArrayExample {

    public static void main(String[] args) {
        //join(CharSequence delimiter, CharSequence… elements)
        String joinedString = String.join(",", "hello", "world", "!");
        System.out.println("示例1:" + joinedString);
        //join(CharSequence delimiter, Iterable elements)
        List<String> strList = Arrays.asList("hello", "world", "!");
        String joinedString1 = String.join(",", strList);
        System.out.println("示例2:" + joinedString1);
        //StringJoiner for formatted output
        StringJoiner stringJoiner1 = new StringJoiner(",");
        stringJoiner1.add("hello").add("world").add("!");
        System.out.println("示例3:" + stringJoiner1.toString());

        StringJoiner stringJoiner2 = new StringJoiner(",", "[", "]");
        stringJoiner2.add("hello").add("world").add("!");
        System.out.println("示例4:" + stringJoiner2.toString());

        List<String> strList1 = Arrays.asList("hello", "world", "!");
        String joinedString3 = strList1.stream().collect(Collectors.joining(",","[","]"));
        System.out.println("示例5:"+joinedString3);
       //Join String Array using StringUtils.join() method – Apache Commons Lang
        String[] strArray = {"hello", "world", "!"};
        String joinedString4 = StringUtils.join(strArray, ",");
        System.out.println("示例6:" + joinedString4);
    }
}