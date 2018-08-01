package com.eshare.lambda.chapter2;

import com.eshare.lambda.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结合线程使用
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class ThreadExample {

    public static void main(String[] args) {

        //线程池使用lambda表达式代替new Runnable的唯一抽象方法
        new Thread(() -> {
            System.out.println("开启线程");
        }).start();

    }

}
