package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.userDao.delete(user);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return this.userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.getAll();
	}

}
