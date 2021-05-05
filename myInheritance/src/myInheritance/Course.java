package myInheritance;

public class Course {
	private int id;
	private String name;
	private int startCourse;
	private int endCourse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStartCourse() {
		return startCourse;
	}
	public void setStartCourse(int startCourse) {
		this.startCourse = startCourse;
	}
	public int getEndCourse() {
		return endCourse;
	}
	public void setEndCourse(int endCourse) {
		this.endCourse = endCourse;
	}
	public Course(int id, String name, int startCourse, int endCourse) {
		this.id = id;
		this.name = name;
		this.startCourse = startCourse;
		this.endCourse = endCourse;
	}
}
