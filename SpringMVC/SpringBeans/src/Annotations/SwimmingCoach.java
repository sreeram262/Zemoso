package Annotations;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class SwimmingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "practice butterfly stroke";
    }


}
