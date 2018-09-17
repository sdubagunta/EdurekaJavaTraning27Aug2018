package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class student {

	Integer id;
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getTotal_marks() {
		return total_marks;
	}

	String name;
	double total_marks;

	student(Integer s_id, String s_name, double s_totalMarks) {
		id = s_id;
		name = s_name;
		total_marks = s_totalMarks;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", total_marks=" + total_marks + "]";
	}

}

public class StudentRecords_usingHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		student s1 = new student(250, "John", 500.00);
		student s2 = new student(251, "Joe", 875.00);
		student s3 = new student(252, "Mike", 566.00);
		student s4 = new student(253, "Sam", 425.00);
		student s5 = new student(254, "Leo", 598.00);

		Hashtable<Integer, student> stu = new Hashtable<Integer, student>();
		stu.put(s1.id, s1);
		stu.put(s2.id, s2);
		stu.put(s3.id, s3);
		stu.put(s4.id, s4);
		stu.put(s5.id, s5);
		
		Set<Integer> keys = stu.keySet(); // keySet method returns a Set of all the Keys in the Map
		
		  Iterator<Integer> itr = keys.iterator();
		  double temp=0;
		  Integer tempKey=0;
		  
		  while(itr.hasNext()){
		   Integer key = itr.next();
		   student value = stu.get(key);
		   if(temp==0)
		   {  
			   temp = value.getTotal_marks();
		   }
		   else if(temp < value.getTotal_marks())
		   {
			   temp =value.getTotal_marks();
			   tempKey = key;
		   }
		  }
		  System.out.println("Student with Highest Marks"+"\n"+stu.get(tempKey));
		  
		  
	}

}
