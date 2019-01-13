package com.learn.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题接口
 */
public interface Subject
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
    default void addObserver(Observer observer)
    {
        observerList.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    default void removeObserver(Observer observer)
    {
        observerList.remove(observer);
    }

    /**
     * 通知所有主题观察者（主题订阅者）
     */
    default void notifyObserver()
    {
        for (Observer observer:observerList)
        {
            observer.update(this);
        }
    }

}
