package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import dataAccess.repository.Users;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private Users users;
	
	
	public InMemoryUserDao() {
	
//		if (users.size()>0) {
//			users.clear();
//		}	
		users=new Users();
		User user1 =new User(1, "Kiþi1", "KiþiAbc1", "Kiþi@Kiþi1.com", "123");
		User user2 =new User(2, "Kiþi2", "KiþiAbc2", "Kiþi@Kiþi2.com", "123");
		User user3 =new User(1, "Kiþi3", "KiþiAbc3", "Kiþi@Kiþi3.com", "123");
		User user4 =new User(2, "Kiþi4", "KiþiAbc4", "Kiþi@Kiþi4.com", "123");
//		users.getUsers().add(user1);
//		users.getUsers().add(user2);
//		users.getUsers().add(user3);
//		users.getUsers().add(user4);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
		if (users.getUsers().contains(user)==true) {
			users.getUsers().remove(user);
		}
		users.getUsers().add(user);
		System.out.println("In Memory ile güncellendi "+user.getFirstName());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.getUsers().remove(user);
		System.out.println("In Memory ile silindi "+user.getFirstName());
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		for (int i = 0;i<users.getUsers().size();i++) {
			if (users.getUsers().get(i).getId()==id) {
				return users.getUsers().get(i);
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
	
		return users.getUsers();
	}

}
