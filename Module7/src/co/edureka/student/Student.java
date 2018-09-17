package co.edureka.student;

public class Student {

	public int student_id;
	public String std;
	public String name;
	public int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String std, String name, int marks) {
		super();
		this.student_id = student_id;
		this.std = std;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", std=" + std + ", name=" + name + ", marks=" + marks + "]";
	}

}
