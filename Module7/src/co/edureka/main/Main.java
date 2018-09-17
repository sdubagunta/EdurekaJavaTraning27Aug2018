package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.student.*;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student(100, "John", "EEE", 500);
		Student s2 = new Student(200, "Mike", "CSE", 323);
		Student s3 = new Student(230, "Swathi D", "CSE", 657);

		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		helper.insertStudent(s1);
		helper.insertStudent(s2);
		helper.insertStudent(s3);
		helper.updateStudent(s1);
		helper.updateStudent(s2);
		helper.deleteStudent(200);

		ArrayList<Student> sList = helper.getEmployees();
		for (Student s : sList) {
			System.out.println(s);
		}

		helper.executeBatch();

		helper.closeConnection();
	}

}
