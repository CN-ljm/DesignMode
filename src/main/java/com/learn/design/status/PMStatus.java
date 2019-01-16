package com.learn.design.status;

/**
 * 下午工作状态
 */
public class PMStatus implements Status
{
    @Override
    public void handle(OneDateContext context)
    {
        int time = context.getTime();
        if( 12 <= time && time <= 20)
        {
            System.out.println("下午干活，比较清醒，达到最高效率！！！");
        }
        else
        {
            context.setStatus(new NightStatus());
            context.execute();
        }
    }
}
