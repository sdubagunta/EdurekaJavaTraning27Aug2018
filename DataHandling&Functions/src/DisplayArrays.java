import java.util.Scanner;

public class DisplayArrays {

	void display(int ID[], String Name[], double Salary[]) {

		System.out.println("ID      Name     Salary");
		System.out.println("------------------------");
		int length = ID.length;
		for (int i = 0; i < length; i++) {
			System.out.println(ID[i] + "     " + Name[i] + "     " + Salary[i]);
		}
	}

	void display(int ID[], String Name[]) {
		System.out.println("ID     Name");
		System.out.println("------------------------");
		int length = ID.length;
		for (int i = 0; i < length; i++) {
			System.out.println(ID[i] + "     " + Name[i]);
		}
	}

	void display(String EmpName, int ID[], String Name[], double Salary[]) {
		System.out.println("ID      Name     Salary");
		System.out.println("------------------------");
		int length = ID.length;
		for (int i = 0; i < length; i++) {
			if (Name[i].equals(EmpName)) {
				System.out.println(ID[i] + "     " + Name[i] + "     " + Salary[i]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of employees");
		int emp = sc.nextInt();

		int ID[] = new int[emp];
		String[] Name = new String[emp];
		double Salary[] = new double[emp];

		for (int i = 0; i < emp; i++) {
			System.out.println("Enter ID NAME SALARY in the same Order:");
			ID[i] = sc.nextInt();
			Name[i] = sc.next();
			Salary[i] = sc.nextInt();
		}

		DisplayArrays myobj = new DisplayArrays();
		myobj.display(ID, Name, Salary);
		myobj.display(ID, Name);
		System.out.println("Enter employee name to search:");
		String EmpName;
		EmpName = sc.next();
		myobj.display(EmpName, ID, Name, Salary);
		sc.close();
	}
}
