import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new  AnnotationConfigApplicationContext(JavaConfig.class);

        SecondBean secondBean = applicationContext.getBean("secondBean",SecondBean.class);
        System.out.println(secondBean.getFirstBean().toString());

    }
}
