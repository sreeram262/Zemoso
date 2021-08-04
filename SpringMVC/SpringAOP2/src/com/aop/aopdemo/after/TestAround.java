package com.aop.aopdemo.after;

import com.aop.aopdemo.DemoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficService trafficService = context.getBean("trafficService", TrafficService.class);

        System.out.println("started...");

        System.out.println(trafficService.getFortune());

        System.out.println("end");
        try {
            System.out.println(trafficService.getFortune(true));
        } catch (Exception e) {
            // never reaches cuz exception handled by the around advice

            //System.out.println("exception forwarded as is");
            e.printStackTrace();
        }
    }
}
