package interfaces;

public class DatabaseLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Database Logland� : "+message);
	}

}
