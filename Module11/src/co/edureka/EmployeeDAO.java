package co.edureka;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;



public class EmployeeDAO {

	HibernateTemplate template;
	@Autowired
	public void setSessionFactory (SessionFactory factory){
		if(template==null)
		{
			template = new HibernateTemplate(factory);
		template.setCheckWriteOperations(false);
		}
				
	}
	
	public void saveEmployee (Employee e){
	
		template.save(e);
	
			
		System.out.println(e.getName() + " saved");
	}
	

	
}
