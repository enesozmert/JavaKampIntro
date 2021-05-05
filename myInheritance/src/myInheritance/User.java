package myInheritance;

public class User {
	private int id;
	private String nickName;
	private String firstName;
	private String lastName;
	private int birthDate;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String nickName, String firstName, String lastName, int birthDate, String password) {
		this.id = id;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.password = password;
		setBirthDate(birthDate);
		setFirstName(firstName);
		setId(id);
		setLastName(lastName);
		setNickName(nickName);
		setPassword(password);
	}
	public User() {
		
	}
}
