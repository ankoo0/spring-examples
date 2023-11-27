package springApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        Now, the Spring DI/IoC Container (Application Context) will take responsibility of creating
        dependencies and injecting it leaving us with fully configured application
        Code now simpler and cleaner
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        FileService fileService = context.getBean("fileService",FileService.class);
        System.out.println(fileService);
    }
}
