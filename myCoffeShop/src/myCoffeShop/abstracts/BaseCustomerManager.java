package myCoffeShop.abstracts;

import myCoffeShop.entites.Customer;

public abstract class BaseCustomerManager implements CustomerDao {

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getLastName()+"Veri tabanýna kaydedildi");
	}

}
