package core;

import entities.concretes.User;

public interface GoogleAPIService {
	void login(User user);
	void register(User user);
}
