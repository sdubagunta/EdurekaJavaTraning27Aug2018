package co.edureka.main;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.eid =4;
		emp1.name = "Mike";
		emp1.exp = 3;
		emp1.salary = 432221;
		emp1.address = "Chennai";
		
		Employee emp2 = new Employee(7,"Swathi",5, 65499,"Delaware");
		
		//System.out.println(emp1);
	//	System.out.println(emp2);
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		helper.saveEmployee(emp1);
		helper.saveEmployee(emp2);
		helper.closeConnection();
	}

}
