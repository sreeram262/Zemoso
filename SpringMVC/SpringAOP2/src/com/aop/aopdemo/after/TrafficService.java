package com.aop.aopdemo.after;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficService {

    public String getFortune()
    {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Heavy traffic today!";
    }

    public String getFortune(boolean flag) throws Exception {
        throw new Exception();
    }
}
