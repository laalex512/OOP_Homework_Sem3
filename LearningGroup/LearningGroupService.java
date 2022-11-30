package Homework3.LearningGroup;

import Homework3.Users.Student;
import Homework3.Users.Teacher;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LearningGroupService {

	public static LearningGroup readGroup(String pathFile) {
		String groupName = pathFile.substring(pathFile.lastIndexOf("/") + 1,
			 pathFile.lastIndexOf("."));
		LearningGroup currentGroup = new LearningGroup(groupName);

		try (FileReader fr = new FileReader(pathFile)) {
			Scanner scanner = new Scanner(fr);
			ArrayList<String> lines = new ArrayList<>();
			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
			fr.close();
			for (String i : lines) {
				String[] line = i.split(" ");
				if (line[0].equals("Teacher:")) {
					currentGroup.setTeacher(new Teacher(line[1], line[2], line[3]));
				}
				else if (!line[0].equals("Students:")){
					currentGroup.addStudent(new Student(line[0], line[1], line[2]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return currentGroup;
	}
}
