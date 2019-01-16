package com.learn.design.status;

public class AMStatus implements Status
{
    @Override
    public void handle(OneDateContext context)
    {
        int time = context.getTime();
        if( 9 <= time && time <= 12)
        {
            System.out.println("早上干活，有点困，但是头脑清醒！！！");
        }
        else
        {
            context.setStatus(new PMStatus());
            context.execute();
        }
    }
}
