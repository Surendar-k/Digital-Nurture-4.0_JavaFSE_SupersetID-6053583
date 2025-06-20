package Exercise_11_Implementing_DependencyInjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
       
        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.getCustomerDetails("C101");
        service.getCustomerDetails("C999");
    }
}
