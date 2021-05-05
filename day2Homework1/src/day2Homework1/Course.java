package day2Homework1;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int id,String name,String instructor,int start,int end) {
		this();
		this.id=id;
		this.name=name;
		this.instructor=instructor;
		this.start=start;
		this.end=end;
	}
	
	int id;
	String name;
	String instructor;
	int start;
	int end;
	
}
