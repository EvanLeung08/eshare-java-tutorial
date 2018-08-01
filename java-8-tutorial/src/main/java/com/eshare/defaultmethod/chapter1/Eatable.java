package com.eshare.defaultmethod.chapter1;

/**
 * Eatable默认接口演示
 *
 * @author liangyh
 * @email liangyuhua@ppmoney.com
 * @date 2018/7/31
 */
public interface Eatable {
    default void eat(){
        System.out.println("我在吃东西");
    }
}
