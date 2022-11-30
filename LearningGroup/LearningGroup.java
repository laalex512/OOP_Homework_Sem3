package Homework3.LearningGroup;

import Homework3.Users.Student;
import Homework3.Users.Teacher;
import java.util.ArrayList;

public class LearningGroup{
	private String name;
	private Teacher teacher;
	private ArrayList<Student> studentList = new ArrayList<>();


	public LearningGroup(String name) {
		this.name = name;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void addStudent(Student student) {
		this.studentList.add(student);
	}

	@Override
	public String toString() {
		String message = this.name + "\n" + "Teacher: " + teacher + "\n" + "Students: " + "\n";
		for (Student i : this.studentList) {
			message += i + "\n";
		}
		return message;
	}
}
