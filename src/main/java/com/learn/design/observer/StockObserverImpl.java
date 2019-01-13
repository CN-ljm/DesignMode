package com.learn.design.observer;

/**
 * 股票行情观察者
 */
public class StockObserverImpl implements  Observer
{
    private String name;

    public StockObserverImpl(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Subject subject)
    {
        System.out.println(name + "兄弟，股票涨啦" + subject.status);
    }
}
