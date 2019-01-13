package com.learn.design.observer;

/**
 *  抽象观察者
 */
public interface Observer
{
    default void update(Subject subject){
        System.out.println("消息主题状态是：" + subject.status);
    }
}
