package com.learn.design.status;

/**
 * 一天工作状态
 */
public class OneDateContext
{
    //时间
    private int time;

    private Status status;

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void execute()
    {
        status.handle(this);
    }
}
