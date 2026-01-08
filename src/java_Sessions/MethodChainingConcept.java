package java_Sessions;

public class MethodChainingConcept {
	
	
	//NS- NS: Direct calling No object is required
	//S- NS: Create the object and then call it
	//S -S : direct calling/ using class name
	//NS - S: direct calling/ using class name
	
	public void m1() {
		System.out.println("This is m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("This is m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("This is m3 method");
		m4();
	}
	
	
	public void m4() {
		System.out.println("This is m4 method");
		test1();
		MethodChainingConcept.test1();
	}
	
	public static void test() {
		System.out.println("Static Test method");
	}
	
	public static void test1() {
		System.out.println("Static test1 method");
		test();
		MethodChainingConcept.test();
	}
	
	
	

	public static void main(String[] args) {
	MethodChainingConcept mc= new MethodChainingConcept();
	
	mc.m1();

	}

}
