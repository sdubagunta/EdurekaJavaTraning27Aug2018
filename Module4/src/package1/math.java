package package1;

public class math {

	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("a - b is " + c);
	}

	public void mult(int a, int b) {
		int c = a * b;
		System.out.println("Product of a and b is " + c);
	}
	public void div(int a, int b){
		int c = a/b;
		System.out.println("a/b =" +c);
	}
	public void fact(int i){
		int factorial = 1;
		for (int j = i; j > 0; j--) {
			factorial = factorial * j;
		}
		System.out.println("Factorial for " + i + " is: " + factorial);
	}
	public void rev(int i){
	
		int rev = 0;
		for (; i > 0; i = i / 10) {
			int remainder = i % 10;
			rev = rev*10 + remainder;
		}
		System.out.println("Number in reverse order" + " = " + rev);
	}
}
