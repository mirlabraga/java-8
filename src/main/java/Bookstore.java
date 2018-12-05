import java.util.Optional;

public class Bookstore {

	private Optional<Customer> customers;

	public Optional<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Optional<Customer> customers) {
		this.customers = customers;
	}

}
