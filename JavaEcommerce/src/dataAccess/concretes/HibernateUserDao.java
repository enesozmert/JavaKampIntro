package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao  {

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullan�c� silindi "+user.getFirstName());
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		//System.out.println("Kullan�c� eklendi "+user.getFirstName());
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
