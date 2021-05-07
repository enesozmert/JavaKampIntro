package myCoffeShop;

import myCoffeShop.abstracts.BaseCustomerManager;
import myCoffeShop.concretes.NeroCustomerManager;
import myCoffeShop.concretes.SturbucksCustomerManager;
import myCoffeShop.core.MernisDaoAdapter;
import myCoffeShop.entites.Customer;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager=new SturbucksCustomerManager(new MernisDaoAdapter());
		customerManager.Save(new Customer(1, "Enes", "Özmert", LocalDate.now() , 25848484));
		
	}

}
