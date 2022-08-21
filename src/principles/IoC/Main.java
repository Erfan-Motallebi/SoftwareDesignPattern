package principles.IoC;

public class Main {

	public static void main(String[] args) {
		CustomerService customerOne = new CustomerService();
		System.out.println(customerOne.getCustomerId(8));
	}

}
