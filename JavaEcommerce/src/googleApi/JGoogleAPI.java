package googleApi;

import entities.concretes.User;

public class JGoogleAPI {
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google ile giriþ yapýldý" + user.getEmail());
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("google ile kayýt olundu" + user.getEmail());
	}
}
