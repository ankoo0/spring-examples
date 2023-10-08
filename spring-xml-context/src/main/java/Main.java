import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean bean = context.getBean("someBean", Bean.class);

        bean.helloBean();
        System.out.println(bean);

        context.close();

    }
}
