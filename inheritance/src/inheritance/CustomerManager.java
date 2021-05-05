package inheritance;

public class CustomerManager {
//	public void add(IndividualCustomer customer) {
//		System.out.println(customer.customerNumber + " Kaydedildi");
//	}
//
//	public void add(CorporateCustomer customer) {
//		System.out.println(customer.customerNumber+" Kaydedildi");
//	}
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi");
	}
	//bulk insert
	public void addMulti(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
//SOLÝD
//O=>Open 