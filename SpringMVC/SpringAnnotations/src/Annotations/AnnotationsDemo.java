package Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo {
    public static void main(String[] args) {
        // uses xml
        //ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appconfig.xml");
        //wothout xml
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);

//        Coach theCoach1=context.getBean("swimmingCoach",Coach.class);
//        Coach theCoach2=context.getBean("swimmingCoach",Coach.class);
        // observe that spring is not creating 2 objects,hence constructor is also executed only once
//        System.out.println((theCoach1==theCoach2)+" "+theCoach1.getDailyFortune());
//        System.out.println(theCoach2.getDailyFortune());
//       System.out.println(theCoach.getDailyWorkout());
//        System.out.println(theCoach.getDailyFortune());
        SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
        System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getDailyFortune());
        System.out.println(theCoach.getTeam()+" "+theCoach.getEmail());
        context.close();
    }
}
