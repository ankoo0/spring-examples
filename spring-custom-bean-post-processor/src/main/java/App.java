import beans.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("beans","bpp");

        CommentService commentService = (CommentService) context.getBean("commentService");
        System.out.println(commentService.testBeanInjection());
    }
}
