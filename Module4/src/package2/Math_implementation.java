package package2;

import package1.math;

public class Math_implementation extends math {

	public static void main(String[] args) {

		int a = 25;
		int b = 13;
		Math_implementation myobj = new Math_implementation();
		myobj.sub(a, b);
		myobj.mult(a, b);
		myobj.div(a, b);
		myobj.fact(10);
		myobj.rev(123);
	}

}
