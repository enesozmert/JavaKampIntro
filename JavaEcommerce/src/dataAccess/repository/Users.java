package dataAccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.concretes.User;

public class Users {
	public List<User> listOfUsers=new ArrayList<User>();
	public List<User> getUsers() {
		User user1 =new User(1, "Ki�i1", "Ki�iAbc1", "Ki�i@Ki�i1.com", "123");
		User user2 =new User(2, "Ki�i2", "Ki�iAbc2", "Ki�i@Ki�i2.com", "123");
		User user3 =new User(1, "Ki�i3", "Ki�iAbc3", "Ki�i@Ki�i3.com", "123");
		User user4 =new User(2, "Ki�i4", "Ki�iAbc4", "Ki�i@Ki�i4.com", "123");
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		listOfUsers.add(user3);
		listOfUsers.add(user4);
		return listOfUsers;
	}
}
