package com.eshare.dateapi.chapter1;

import java.time.*;

/**
 * DatesExample
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class DatesExample {

    public static void main(String[] args){
        //LocalDate示例
        LocalDate localDate =LocalDate.now();
        System.out.println(localDate);
        //LocalTime示例
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        //OffsetDateTime示例
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);
        //ZonedDateTime示例
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);
    }
}
