package com.learn.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NBA主题通知者
 */
public class NBASubjectImpl implements Subject
{
    public String status = "";

    /**
     * 观察者列表
     */
    public List<Observer> observerList = new ArrayList<>();


    /**
     * 新增观察者
     * @param observer
     */
    @Override
    public void addObserver(Observer observer)
    {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer)
    {
        observerList.remove(observer);
    }

    /**
     * 通知所有主题观察者（主题订阅者）
     */
    @Override
    public void notifyObserver()
    {
        for (Observer observer:observerList)
        {
            observer.update(this);
        }
    }
}
