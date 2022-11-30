package Homework3.Users;

public class Student extends User {
	private String studentId;

	public Student(String name, String birthday, String studentId) {
		super.setName(name);
		super.setBirthday(birthday);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.studentId;
	}
}
