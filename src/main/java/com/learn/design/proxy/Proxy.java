package com.learn.design.proxy;

/**
 * 代理类
 */
public class Proxy implements Subject
{
    Subject real = null;

    @Override
    public void requent(String nanme)
    {
        if (real == null)
        {
            real = new RealSubject();
            real.requent("真人");
        }
    }
}
