package dataAccess.concretes;

import dataAccess.abstracts.AuthDao;
import entities.concretes.User;

public class HibernateAuthDao implements AuthDao {

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println("Giriþ baþarýlý "+user.getFirstName());
	}
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kayýt baþarýlý "+user.getFirstName());
	}
	
}
