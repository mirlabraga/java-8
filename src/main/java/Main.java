import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		// Create the Optional of the Customers
		
		Bookstore livraria = new Bookstore();
		
		// If Optional.empty()
		// Return Optional.empty
		Optional<Customer> customers = Optional.empty();
		livraria.setCustomers(customers);
		System.out.println("First System.out.println: "+ livraria.getCustomers());
		
		// If new instance with Optional.of, where set the name
		// Return Optional[Mirla Chucre]
		Customer customer2 = new Customer();
		customer2.setName("Mirla Chucre");
		Optional<Customer> customers2 = Optional.of(customer2);
		System.out.println("Second System.out.println: "+customers2);
		
		// If new instance with Optional.of, where set the 
		// customer equals null, so throw Exception java.lang.NullPointerException
		Customer customer3 = null;
		// Optional<Customer> customers3 = Optional.of(customer3);
		// System.out.println("Third System.out.println: "+customers3);
		
		// If new instance with Optional.ofNullable, where set the 
		// customer equals null, so return Optional.empty
		Optional<Customer> customer4 = Optional.ofNullable(customer3);
		System.out.println("Fourth System.out.println: "+customer4);
		
		// Exception java.util.NoSuchElementException: No value present
		// Because the Optional<Customer> is empty
		// livraria.getCustomers().get();
	}
}
