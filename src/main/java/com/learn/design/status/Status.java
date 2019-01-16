package com.learn.design.status;

/**
 * 状态设计模式，状态类
 */
public interface Status
{
    default void handle(OneDateContext context)
    {
        System.out.println("进入处理！！！");
    }
}
