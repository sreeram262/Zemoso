package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class SwimmingCoach implements Coach{

    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    SwimmingCoach(FortuneService fortuneService)
//    {
//        this.fortuneService=fortuneService;
//    }
    SwimmingCoach()
    {
        System.out.println("inside constructor");
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//          System.out.println("inside setter method");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired
//    public void doCrazyStuff(FortuneService fortuneService)
//    {
//        System.out.println("inside crazy method");
//        this.fortuneService=fortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "practice butterfly stroke";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Swimming bean created");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Swimming bean destroyed");
    }

}
