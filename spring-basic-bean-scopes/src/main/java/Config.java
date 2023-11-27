import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope(value = "singleton")
    SingletonBean singletonBean(){
        return new SingletonBean();
    }

    @Bean
    @Scope(value = "prototype")
    PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }

}
