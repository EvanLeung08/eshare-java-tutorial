package com.eshare.string2date.chapter1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * String2DateExample
 *
 * @author liangyh
 * @date 2018/8/7
 */
public class String2DateExample {

    public static void main(String[] args){
        //Convert string to date in ISO8601 format
        String originalDate = "2018-08-07";
        LocalDate localDate = LocalDate.parse(originalDate);
        System.out.println("Date:"+localDate);

        //Convert string to date in custom formats
        String originalDate1 = "2018-08-07 10:47:00";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDate localDate1 = LocalDate.parse(originalDate1,formatter);
        System.out.println("custom date:"+localDate1);


    }
}