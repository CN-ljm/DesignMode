package com.learn.design.status;

/**
 * 状态设计模式，入口类
 */
public interface Context
{
    /**
     * 返回状态判断依据
     * @return 时间
     */
    public int getTime();

    /**
     * 执行处理
     */
    public void execute();
}
