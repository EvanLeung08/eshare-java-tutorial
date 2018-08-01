package com.eshare.functioninterface.chapter1;

/**
 * 功能特性
 *
 * @author liangyh
 * @date 2018/7/31
 */
@FunctionalInterface
public interface MyFuntinoalInterface1<T> {

    public void eat();
    /**
     * 超过一个抽象方法会编译报错，可以把下面注释去掉查看效果
     */
    //public void play();
}
