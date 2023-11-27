package DIIoC;

public class Main {
    public static void main(String[] args) {

        /*
        In this case we decoupled dependencies from internal logic but still need to create them manually and pass as a constructor args
        Imagine if there is a ton of such dependencies?
        Moreover, usage of new operator means allocation of memory for each new object. Better approach is to use singleton pattern instead
        See Spring example to understand how to solve these problems
         */

        // dependency creation
        StationDAO stationDAO = new StationDAO();
        UserRepository userRepository = new UserRepository();
        BillingDetailsService billingDetailsService = new BillingDetailsService();
        CustomerService customerService = new CustomerService(billingDetailsService);

        // injection
        CarService carService = new CarService(stationDAO,userRepository,customerService);

    }
}
