package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Customer customer = new Customer();
//		customer.id = 1;
//		customer.firstName = "Engin";
//		customer.lastName = "Abc";
//		customer.customerNumber = "111";

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		
		CorporateCustomer hepsiBuradaCorporateCustomer = new CorporateCustomer();	
		hepsiBuradaCorporateCustomer.customerNumber="78910";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(engin);
		customerManager.add(hepsiBuradaCorporateCustomer);
		Customer customer = new Customer();
		Customer[] customers= {engin,hepsiBuradaCorporateCustomer};
		customerManager.addMulti(customers);
	}

}
