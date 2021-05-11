package dataAccess.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.concretes.User;

public class Users {
	public List<User> listOfUsers=new ArrayList<User>();
	public List<User> getUsers() {
		User user1 =new User(1, "Kiþi1", "KiþiAbc1", "Kiþi@Kiþi1.com", "123");
		User user2 =new User(2, "Kiþi2", "KiþiAbc2", "Kiþi@Kiþi2.com", "123");
		User user3 =new User(1, "Kiþi3", "KiþiAbc3", "Kiþi@Kiþi3.com", "123");
		User user4 =new User(2, "Kiþi4", "KiþiAbc4", "Kiþi@Kiþi4.com", "123");
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		listOfUsers.add(user3);
		listOfUsers.add(user4);
		return listOfUsers;
	}
}
