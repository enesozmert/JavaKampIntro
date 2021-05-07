package myCoffeShop.concretes;

import myCoffeShop.abstracts.BaseCustomerManager;
import myCoffeShop.abstracts.CustomerCheckDao;
import myCoffeShop.entites.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckDao customerCheckDao;

	public SturbucksCustomerManager(CustomerCheckDao customerCheckDao) {
		super();
		this.customerCheckDao = customerCheckDao;
	}

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		// CheckIfRealPerson(customer);
		if (customerCheckDao.CheckIfRealPerson(customer)) {
			super.Save(customer);
			System.out.println("Veri tabanýna kaydedildi");
		} else {
			System.err.println("Cannot divide by zero");
		}
	}
}
