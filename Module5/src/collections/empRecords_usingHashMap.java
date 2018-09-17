package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class employee {
	Integer id;
	String name;
	double salary;
	String dept;

	employee(Integer emp_id, String emp_name, double emp_salary, String emp_dept) {

		id = emp_id;
		name = emp_name;
		salary = emp_salary;
		dept = emp_dept;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

}

public class empRecords_usingHashMap {

	public static void main(String[] args) {

		employee e1 = new employee(100, "John", 50000, "IT");
		employee e2 = new employee(101, "Mike", 40000, "HR");
		employee e3 = new employee(102, "Bob", 50000, "Admin");
		employee e4 = new employee(103, "Joe", 80000, "IT");
		employee e5 = new employee(104, "Kate", 65000, "IT");

		// writing employee records using HashMap

		HashMap<Integer, employee> rec = new HashMap<Integer, employee>();

		rec.put(e1.id, e1);
		rec.put(e2.id, e2);
		rec.put(e3.id, e3);
		rec.put(e4.id, e4);
		rec.put(e5.id, e5);

		// Printing Employee Records

		// Using Entry Set
		System.out.println("-----------------------------------");
		Iterator<Entry<Integer, employee>> trav = rec.entrySet().iterator();
		while (trav.hasNext()) {
			Entry<Integer, employee> record = trav.next(); // will give next
															// (Key, Value) pair
			employee j = (employee) record.getValue();
			System.out.println(record.getKey() + "\t" + j.id + "\t" + j.name + "\t" + j.salary + "\t \t" + j.dept);
		}
		System.out.println("-----------------------------------");

		// Using Key set and Iterator
		Set<Integer> keys = rec.keySet(); // keySet method returns a Set of all
											// the Keys in the Map
		Iterator<Integer> itr = keys.iterator();
		System.out.println(">>>>>>><<<<<<");
		while (itr.hasNext()) {
			Integer key = itr.next();
			employee value = rec.get(key);
			System.out.println(key + "\t" + value.toString());
		}
		System.out.println(">>>>>>><<<<<<");
	}

}
