package com.learn.design.observer;

/**
 * NBA观察者
 */
public class NBAObserverImpl implements Observer
{
    private String name;

    public NBAObserverImpl(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Subject subject)
    {
        System.out.println(name + ",NAB直播开始啦，状态是：" + subject.status);
    }
}
