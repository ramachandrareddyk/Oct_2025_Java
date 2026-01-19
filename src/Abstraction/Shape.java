package Abstraction;

public abstract class Shape {
	
	public Shape() {
		System.out.println("This is abstract class const");
	}
	
	public abstract double area();
	//public abstract void shape1();
	
	public void display() {
		System.out.println("This is shape");
	}
	public static void m1() {
		System.out.println("This is static method");
	}
	
	

}
