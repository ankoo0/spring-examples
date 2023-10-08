import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    FirstBean firstBean(){
        return new FirstBean("Some Message");
    }

    @Bean
    SecondBean secondBean(){
        return new SecondBean(firstBean());
    }
}
