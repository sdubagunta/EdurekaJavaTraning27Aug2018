import java.io.*;

class employee {
	int id;
	double salary;
	String name;
	String dept;

	employee(int emp_id, double emp_salary, String emp_name, String emp_dept) {
		id = emp_id;
		name = emp_name;
		salary = emp_salary;
		dept = emp_dept;

	}
}

public class save_data_to_xml {

	public static void main(String[] args) {
		
		employee e1= new employee(100, 50000, "John", "IT");
		employee e2= new employee(200, 60000, "Joe", "IT");
		
		
		
	}

}
