package business.concretes;

import core.Regex;
import core.RegexPatterns;
import entities.concretes.User;

public class UserValidate {
	public boolean isMailValid(User user) {
		// TODO Auto-generated method stub
		return Regex.isvalid(user.getEmail(), RegexPatterns.email());
	}

	public boolean isCheckNameTwoLengthThen(User user) {
		// TODO Auto-generated method stub
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}
		return false;
	}
	public boolean isPasswordCheckSixLengthThen(User user) {
		if (user.getPassword().length()>6) {
			return true;
		}
		return false;
	}
}
