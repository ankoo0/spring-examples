package beans;

import annotations.DependencyInjection;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    @DependencyInjection
    private CommentRepository commentRepository;


    public String testBeanInjection(){
        return commentRepository==null ? "Bean is not injected" : "Bean " + commentRepository.hashCode() + " has been injected";
    }
}
