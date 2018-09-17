package co.edureka.model;

public class Employee {

	public int eid;
	public String name;
	public int exp;
	public int salary;
	public String address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, int exp, int salary, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", exp=" + exp + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
}
