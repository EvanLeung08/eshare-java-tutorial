package com.eshare.functioninterface.chapter2;

/**
 * 功能特性
 *
 * @author liangyh
 * @date 2018/7/31
 */
@FunctionalInterface
public interface MyFuntinoalInterface<T> {

    public void eat();
    /**
     * 超过一个抽象方法会编译报错
     */
    //public void play();

    /**
     * 重写Object方法不会算入抽象方法统计，可以把下面注释去掉查看效果
     * @return
     */
    @Override
    public String toString();
}