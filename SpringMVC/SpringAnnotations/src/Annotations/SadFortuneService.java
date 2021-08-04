package Annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
//@Scope("prototype") //even if here it is prototype the actual swimmingCoach object is created only once so SadFortuneService not created again at all.
public class SadFortuneService implements FortuneService{
    int count=0;
    @Override
    public String getFortune() {
        return "Today may not be a very good day!"+count++;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Sad fortune bean created");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Sad fortune bean destroyed");
    }
}
