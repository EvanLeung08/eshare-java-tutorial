package com.eshare.dateapi.chapter2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

/**
 * DurationExample
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class DurationExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Instant instant1 = instant.plus(Duration.ofMillis(5000));
        System.out.println("instant1:"+instant1);
        Instant instant2 = instant.minus(Duration.ofMillis(5000));
        System.out.println("instant2:"+instant2);
        Instant instant3 = instant.minusSeconds(10);
        System.out.println("instant3:"+instant3);
        //Duration示例
        Duration duration = Duration.ofMillis(5000);
        System.out.println("duration:"+duration);
        Duration duration1 = Duration.ofSeconds(60);
        System.out.println("duration1:"+duration1);
        Duration duration2 = Duration.ofMinutes(10);
        System.out.println("duration2:"+duration2);

        //Period示例
        Period period = Period.ofDays(30);
        System.out.println("period:"+period);
        Period period1 = Period.between(LocalDate.now(),LocalDate.now().plusDays(60));
        System.out.println("period1:"+period1);
    }
}
