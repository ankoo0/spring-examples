package tightCoupling;

public class UserService {

    /*
    This code is bad because it's tightly coupled.
    Moreover, it's violated SRP,because this class had to manage its own dependencies
    This code is hard to test because we can't provide mocks for this dependencies
     */

    private EmailService emailService = new EmailService();
    private MessageRepository messageRepository;

    public UserService() {
        this.messageRepository = new MessageRepository();
    }
}
