package core;

import java.util.regex.Pattern;

public class Regex {
	public Regex() {

	}
	public static boolean isvalid(String getEmail,String regexPattern) {
		Pattern ptr = Pattern.compile(regexPattern);
		return ptr.matcher(getEmail).matches(); 
	}
}
