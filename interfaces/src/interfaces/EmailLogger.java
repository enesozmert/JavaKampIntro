package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Email Loglandý " +message);
	}

}
