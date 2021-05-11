package dataAccess.abstracts;

import entities.concretes.User;

public interface AuthDao {
	void login(User user);
	void register(User user);
}
