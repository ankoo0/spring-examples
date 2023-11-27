import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SingletonBean s1 = context.getBean("singletonBean", SingletonBean.class);
        SingletonBean s2 = context.getBean("singletonBean", SingletonBean.class);
        System.out.println("singleton 1 " + s1.hashCode() + " singleton 2 " + s2.hashCode());

        PrototypeBean p1 = context.getBean("prototypeBean",PrototypeBean.class);
        PrototypeBean p2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println("prototype 1 " + p1.hashCode() + " prototype 2 " + p2.hashCode());

        System.out.println("As you can see,  beans with singleton scope have same hashcode, because only on instance of a class is created, while prototype scope creates new bean for each case");
    }
}
