package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
