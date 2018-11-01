package co.edureka;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Resource {

	public static void main(String[] args) {
		ClassPathResource r=new ClassPathResource("applicationContext.xml");
	
		BeanFactory factory=new XmlBeanFactory(r);
		
		EmployeeDAO dao=(EmployeeDAO)factory.getBean("dao");
		
		Employee emp=new Employee();
		emp.setName("Sanjit123");
		emp.setBasic(20001);
		emp.setDA(5000);
		emp.setHRA(10000);	
		emp.setDeductions(5000);
		
		dao.saveEmployee(emp);
		System.out.println("Record inserted...");
	}

}
