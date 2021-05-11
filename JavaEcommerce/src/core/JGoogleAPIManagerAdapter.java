package core;

import entities.concretes.User;
import googleApi.JGoogleAPI;

public class JGoogleAPIManagerAdapter implements GoogleAPIService {

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		JGoogleAPI jGoogleAPI=new JGoogleAPI();
		jGoogleAPI.login(user);
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		JGoogleAPI jGoogleAPI=new JGoogleAPI();
		jGoogleAPI.register(user);
	}
	
}
