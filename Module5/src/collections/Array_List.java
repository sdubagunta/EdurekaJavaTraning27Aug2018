package collections;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Adding 10 numbers to the list");

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		System.out.println("Printing the numbers in the arraylist");
		for (int j = 0; j < list.size(); j++) {
			int k = list.get(j);
			System.out.println(k);
		}

	}

}
