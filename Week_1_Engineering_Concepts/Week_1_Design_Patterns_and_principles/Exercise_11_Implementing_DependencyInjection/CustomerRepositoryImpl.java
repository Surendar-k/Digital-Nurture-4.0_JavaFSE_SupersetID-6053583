package Exercise_11_Implementing_DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
 
        if (customerId.equals("C101")) {
            return "Customer: John Doe";
        }
        return "Customer not found";
    }
}

