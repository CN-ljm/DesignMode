package com.learn.design;

import com.learn.design.observer.NBAObserverImpl;
import com.learn.design.observer.NBASubjectImpl;
import com.learn.design.observer.StockObserverImpl;
import com.learn.design.observer.StockSubjectImpl;
import org.junit.Test;

public class ObserverTest
{

//    @Test
    public void testOneSubject()
    {
        NBAObserverImpl nbaObserver = new NBAObserverImpl("张三");
        NBAObserverImpl nbaObserver2 = new NBAObserverImpl("李四");

        NBASubjectImpl nbaSubject = new NBASubjectImpl();
        nbaSubject.addObserver(nbaObserver);
        nbaSubject.addObserver(nbaObserver2);

        nbaSubject.notifyObserver();

    }

    @Test
    public void testOneSubject2()
    {
        NBAObserverImpl nbaObserver = new NBAObserverImpl("张三");
        NBAObserverImpl nbaObserver2 = new NBAObserverImpl("李四");
        StockObserverImpl stockObserver1 = new StockObserverImpl("王五");
        StockObserverImpl stockObserver2 = new StockObserverImpl("赵六");

        NBASubjectImpl nbaSubject = new NBASubjectImpl();
        StockSubjectImpl stockSubject = new StockSubjectImpl();
        stockSubject.addObserver(nbaObserver);
        stockSubject.addObserver(nbaObserver2);
        stockSubject.addObserver(stockObserver1);
        stockSubject.addObserver(stockObserver2);

        nbaSubject.addObserver(nbaObserver);
        nbaSubject.addObserver(nbaObserver2);

        nbaSubject.notifyObserver();
        stockSubject.notifyObserver();

    }

}
