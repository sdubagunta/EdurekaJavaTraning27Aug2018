package co.edureka;

import java.util.Date;

//web service
public class Conversion {

	// Web methods

	public String sayHello(String name) {

		String response = "Hello " + name + " Its " + new Date();
		return response;

	}

	public int feetToInches(int feet) {
		int inches = feet * 12;
		return inches;
	}

	public int mtrsToCMs(int mtrs) {
		int cms = mtrs * 100;
		return cms;
	}

	public int dollarToRupee(int dollar) {
		int rupee = dollar * 70;
		return rupee;
	}

	public String registerUser(String name, String email) {

		// using jdbc or hibernate here
		String response = name + "Registered with email" + email;
		return response;

	}

}
