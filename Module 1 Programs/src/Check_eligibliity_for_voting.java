import java.util.Scanner;

public class Check_eligibliity_for_voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if (age > 18) {
			System.out.println("Candidate is eligible for voting");
		} else
			System.out.println("Candidate not eligible for voting");
		sc.close();
	}
}
