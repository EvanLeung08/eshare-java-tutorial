package com.eshare.lambda.chapter5;

import com.eshare.lambda.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结合事件使用
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public class ListenerExample {

    public static void main(String[] args) {
        //添加事件按钮,使用lambda表达式代替ActionListener的唯一抽象方法
        JButton button = new JButton("submit");
        button.addActionListener(e->{
            System.out.println(e.getSource());
        });

    }

}
