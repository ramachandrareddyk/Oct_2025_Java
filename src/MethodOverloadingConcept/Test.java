package MethodOverloadingConcept;

public class Test {

	// Method overloading:
	// class have multiple methods
	// with same name
	// with different parameters(inputs)
	// and with different number of parameters
	
	
	//Polymorphisam: same action can perform in multiple ways
	//Method Overloading: compile time poly
	//Method Over riding:

	public static void main(String[] args) {
		
		Test t= new Test();
		
		
		t.login("1234567890", 234567);
		
		t.login();

		

	}

	public void m1(int a) {
		System.out.println("This is m1");
	}

	public void m1(String s) {

	}

	public void m1(boolean b) {

	}

	public void m1() {

	}

	public void m1(int a, int b) {//2

	}
	public void m1(int a, String b) {//2

	}
	
	public void login() {
		System.out.println("login");
	}
	public void login(String mobile, int OTP) {
		System.out.println("Login with mobile number and OTP");
	}
	public void login(String username, String password) {
		System.out.println("Login with username and passowrd");
	}
	public void login(String username, String password, int OTP) {
		System.out.println("Login with username and passowrd with OTP");
	}
	
	
	public void bookkCab(String AreaName) {
		
	}
public void bookkCab(String AreaName, int pincode) {
		
	}
public void bookkCab(String AreaName, String Landmark) {
	
}
public void bookkCab(String AreaName, String Landmark, int Pin) {
	
}

//can we overload the Static methods-yes we can
public static void exam(int marks) {
	
}

public static void exam(int marks, String studentName) {
	
}

	

}
