package core;

import sendMail.JCheckLogin;

public class JSendMailManagerAdapter implements SendMailService {

	@Override
	public void isLogin() {
		// TODO Auto-generated method stub
		JCheckLogin jCheckLogin=new JCheckLogin();
		jCheckLogin.isLogin();
	}
	
}
