package exception;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		try {

			for (int i = 0; i < 6; i++) {

				System.out.println("a[i] is " + arr[i]);

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("Program to demonstrate ArrayIndexOutOfBoundsException");
		}
	}

}
