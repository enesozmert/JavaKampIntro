package day2Homework1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginManager loginManager=new LoginManager();
		loginManager.Login();
		loginManager.Register();
		
		Day day =new Day(1,"","",2);
		Day day1 =new Day(1,"","",2);
		Day day2 =new Day(1,"","",2);
		Day[] days= {day,day1,day2};
		
		Course course=new Course(1,"","",1,1);
		Course course1=new Course(1,"","",1,1);
		Course course2=new Course(1,"","",1,1);
		Course course3=new Course(1,"","",1,1);
		Course[] courses = {course,course1,course2,course3};
	}

}
