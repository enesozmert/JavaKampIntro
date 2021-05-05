package myInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Course course1=new Course(1, "course1", 10, 20);
		Course course2=new Course(2, "course2", 11, 21);
		Course course3=new Course(3, "course3", 12, 22);
		//
		User user1=new User(1, "user1", "user1firstName", "user1lastName", 99, "pass1");
		user1.setId(1);
		user1.setNickName("user1firstName");
		user1.setFirstName("user1firstName");
		user1.setLastName("user1lastName");
		user1.setBirthDate(99);
		user1.setPassword("pass1");
		User user2=new User(2, "user2", "user2firstName", "user2lastName", 99, "pass2");
		user1.setId(1);
		user1.setNickName("user1firstName");
		user1.setFirstName("user1firstName");
		user1.setLastName("user1lastName");
		user1.setBirthDate(99);
		user1.setPassword("pass1");
		User user3=new User(3, "user3", "user3firstName", "user3lastName", 99, "pass3");
		user1.setId(1);
		user1.setNickName("user1firstName");
		user1.setFirstName("user1firstName");
		user1.setLastName("user1lastName");
		user1.setBirthDate(99);
		user1.setPassword("pass1");
		//
		StudentIdentity studentIdentity1=new StudentIdentity(1, "identiy1");
		StudentIdentity studentIdentity2=new StudentIdentity(2, "identiy2");
		StudentIdentity studentIdentity3=new StudentIdentity(3, "identiy3");
		
		Student student1=new Student(1, 1);
		Student student2=new Student(2, 2);
		Student student3=new Student(3, 3);
		//
		Instructor instructor1 =new Instructor(1);
		Instructor instructor2 =new Instructor(2);
		Instructor instructor3 =new Instructor(3);
		//
		UserManager userManager=new UserManager();
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		studentManager.add(student3);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		instructorManager.add(instructor3);
	}

}
