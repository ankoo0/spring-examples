package DIIoC;

public class CarService {

    /*
    In this example, dependencies of this class gonna be injected from outside.

     */

    private StationDAO stationDAO;
    private UserRepository userRepository;
    private CustomerService customerService;

    public CarService(StationDAO stationDAO, UserRepository userRepository, CustomerService customerService) {
        this.stationDAO = stationDAO;
        this.userRepository = userRepository;
        this.customerService=customerService;
    }
}
