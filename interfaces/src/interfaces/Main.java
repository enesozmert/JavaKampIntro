package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers= {new EmailLogger(),new FileLogger(),new SmsLogger()};
		
		CustomerManager customerManager =new CustomerManager(loggers);
		Customer customer=new Customer(1,"Engin","Demiroð");
		customerManager.add(customer);
	}

}
