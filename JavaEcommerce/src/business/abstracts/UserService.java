package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
