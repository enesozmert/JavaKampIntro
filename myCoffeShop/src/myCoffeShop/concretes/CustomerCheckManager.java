package myCoffeShop.concretes;

import myCoffeShop.abstracts.CustomerCheckDao;
import myCoffeShop.entites.Customer;
import myCoffeShop.mernis.Mernis;

public class CustomerCheckManager implements CustomerCheckDao {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		Mernis mernis=new Mernis();
		return mernis.get();
	}

}
