import java.util.List;

import business.concretes.AuthManager;
import business.concretes.UserManager;
import business.concretes.UserValidate;
import core.JSendMailManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.InMemoryAuthDao;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserValidate userValidate = new UserValidate();

		User user1 = new User(1, "Enes1", "Abc1", "enes1@enes1.com", "123");
		User user2 = new User(2, "Enes2", "Abc2", "enes2@enes2.com", "123");

		AuthManager authManager = new AuthManager(new InMemoryAuthDao(), new JSendMailManagerAdapter());
		authManager.register(new User(1, "Enes", "Özmert", "enes@enes.com", "123"));

		UserManager userManager = new UserManager(new InMemoryUserDao());
		List<User> usersList = userManager.getAll();
		for (User user : usersList) {
			boolean nameCheck = userValidate.isCheckNameTwoLengthThen(user);
			System.out.println("name is " + nameCheck);
			boolean mailCheck = userValidate.isMailValid(user);
			System.out.println("mail is " + mailCheck);
			boolean passCheck = userValidate.isPasswordCheckSixLengthThen(user);
			System.out.println("pass is " + passCheck);

			System.out.println(user.getFirstName());
		}

	}

}
