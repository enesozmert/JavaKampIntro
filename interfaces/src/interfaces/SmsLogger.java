package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sms gönderildi "+ message);
	}

}
