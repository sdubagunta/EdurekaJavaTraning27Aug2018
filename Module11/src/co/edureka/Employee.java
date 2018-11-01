package co.edureka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "basic")
	private int basic;
	
	@Column(name = "HRA")
	private int HRA;
	
	@Column(name = "DA")
	private int DA;
	
	@Column(name = "deductions")
	private int deductions;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int basic, int hRA, int dA, int deductions) {
		super();
		this.id = id;
		Name = name;
		this.basic = basic;
		HRA = hRA;
		DA = dA;
		this.deductions = deductions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHRA() {
		return HRA;
	}

	public void setHRA(int hRA) {
		HRA = hRA;
	}

	public int getDA() {
		return DA;
	}

	public void setDA(int dA) {
		DA = dA;
	}

	public int getDeductions() {
		return deductions;
	}

	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", basic=" + basic + ", HRA=" + HRA + ", DA=" + DA
				+ ", deductions=" + deductions + "]";
	}

}
