package Homework3.Users;

public class Teacher extends User {

	private String disciplesTaught;

	public Teacher(String name, String birthday, String disciplesTaught) {
		super.setName(name);
		super.setBirthday(birthday);
		this.disciplesTaught = disciplesTaught;
	}

	public String getDisciplesTaught() {
		return disciplesTaught;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.disciplesTaught;
	}
}
