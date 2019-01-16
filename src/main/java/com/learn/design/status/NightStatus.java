package com.learn.design.status;

/**
 * 夜晚时间
 */
public class NightStatus implements Status
{
    @Override
    public void handle(OneDateContext context)
    {
        if( context.getTime() < 9 || context.getTime() > 20 )
        {
            System.out.println("晚上了，开始睡觉了");
        }
        else
        {
            context.setStatus(new AMStatus());
            context.execute();
        }

    }
}
