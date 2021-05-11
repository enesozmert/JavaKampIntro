package business.concretes;

import business.abstracts.AuthService;
import core.JSendMailManagerAdapter;
import core.SendMailService;
import dataAccess.abstracts.AuthDao;
import entities.concretes.User;

public class AuthManager implements AuthService {

	private AuthDao authDao;
	private SendMailService sendMailService;
	
	public AuthManager(AuthDao authDao, SendMailService sendMailService) {
		super();
		this.authDao = authDao;
		this.sendMailService = sendMailService;
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		this.authDao.login(user);
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		this.authDao.register(user);
		sendMailService.isLogin();
	}

}
