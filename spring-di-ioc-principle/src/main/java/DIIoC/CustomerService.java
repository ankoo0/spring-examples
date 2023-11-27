package DIIoC;

public class CustomerService {

    private BillingDetailsService billingDetailsService;

    public CustomerService(BillingDetailsService billingDetailsService) {
        this.billingDetailsService = billingDetailsService;
    }
}
