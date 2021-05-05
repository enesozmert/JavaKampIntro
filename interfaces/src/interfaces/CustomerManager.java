package interfaces;

public class CustomerManager {
	//loosly -- tightly couplet
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+"Müþteri eklendi.");
		
		Utils.runLoggers(loggers, customer.getFirstName()+" Müþteri eklendi.");
	}
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
}
