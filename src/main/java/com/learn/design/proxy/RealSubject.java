package com.learn.design.proxy;

/**
 * 真实类
 */
public class RealSubject implements Subject
{
    @Override
    public void requent(String nanme)
    {
        System.out.println("我的名字是：" + nanme );
    }
}
