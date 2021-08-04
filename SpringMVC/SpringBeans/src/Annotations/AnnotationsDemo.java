package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appconfig.xml");

//        Coach theCoach=context.getBean("MyCoach",Coach.class);
//       System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
