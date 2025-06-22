package Exercise_11_Implementing_DependencyInjection;

public class CustomerService {
    private final CustomerRepository repository;

    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String customerId) {
        String result = repository.findCustomerById(customerId);
        System.out.println(result);
    }
}

