package myCoffeShop.abstracts;

import myCoffeShop.entites.Customer;

public interface CustomerCheckDao {
	boolean CheckIfRealPerson(Customer customer);
}
