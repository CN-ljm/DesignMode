package com.learn.design;

import com.learn.design.proxy.Proxy;
import org.junit.Test;

/**
 * 代理模式测试类
 */
public class ProxyTest
{
    @Test
    public void proxyTest()
    {
        Proxy proxy = new Proxy();
        proxy.requent("代理！");
    }

}
