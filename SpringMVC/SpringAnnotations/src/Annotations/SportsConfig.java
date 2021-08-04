package Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("Annotations")
@PropertySource("classpath:sports.properties")
public class SportsConfig {

    @Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach(sadFortuneService());
    }
}
