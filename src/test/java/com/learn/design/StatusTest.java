package com.learn.design;

import com.learn.design.status.AMStatus;
import com.learn.design.status.OneDateContext;
import org.junit.Test;

public class StatusTest
{
    @Test
    public void  statusDemoTest()
    {
        OneDateContext context = new OneDateContext();
        context.setStatus(new AMStatus());
        context.setTime(2);
        context.execute();

        context.setTime(10);
        context.execute();

        context.setTime(14);
        context.execute();

    }

}
