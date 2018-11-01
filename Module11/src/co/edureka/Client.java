package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		ApplicationContext	context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDAO dao = (EmployeeDAO)context.getBean("dao");
			
		
		Employee emp = new Employee();
		emp.setName("Sanjit123");
		emp.setBasic(20001);
		emp.setDA(5000);
		emp.setHRA(10000);	
		emp.setDeductions(5000);
		
		dao.saveEmployee(emp);
		
	}

}
