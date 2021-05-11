package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.AuthDao;
import dataAccess.repository.Users;
import entities.concretes.User;

public class InMemoryAuthDao implements AuthDao {

    public InMemoryAuthDao() {
		// TODO Auto-generated constructor stub
    	
	}
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
		System.out.println("Kullanci Giriþ Yaptý InMemory "+user.getFirstName());
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		Users _users = new Users();
    	_users.listOfUsers.add(user);
		System.out.println("Kullanci Eklendi InMemory "+user.getFirstName());
	}

}
