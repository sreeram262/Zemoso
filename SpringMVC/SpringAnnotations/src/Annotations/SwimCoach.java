package Annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${sports.email}")
    private String email;
    @Value("${sports.team}")
    private  String team;

    SwimCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000m for warm-up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }


}
