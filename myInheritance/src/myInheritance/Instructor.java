package myInheritance;

public class Instructor extends User {
	private int courseId;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Instructor(int courseId) {
		super();
		this.courseId=courseId;
		setCourseId(this.courseId);
	}
	public Instructor() {
		
	}
}
