package myInheritance;

public class Student extends User {
	private int studentIdentityId;
	private int courseId;
	public int getStudentIdentityId() {
		return studentIdentityId;
	}
	public void setStudentIdentityId(int studentIdentityId) {
		this.studentIdentityId = studentIdentityId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Student(int studentIdentityId, int courseId) {
		super();
		this.studentIdentityId = studentIdentityId;
		this.courseId = courseId;
		setCourseId(this.courseId);
		setStudentIdentityId(this.studentIdentityId );
	}	
	public Student() {
		
	}
}
