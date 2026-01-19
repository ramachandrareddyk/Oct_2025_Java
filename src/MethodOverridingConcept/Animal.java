package MethodOverridingConcept;

public class Animal {
	
	public void sound() {
		System.out.println("Animal makes a sound");
	}
	
	public void food(String AnimalName) {
		System.out.println("Animals eats veg and non veg");
	}
	
	public String AnimalType(String Animal, int Legs) {
		System.out.println("ANiamal name is "+Animal+" having "+Legs+" legs");
		
		return Animal;
	}
	
	public static void test() {
		System.out.println("This is test");
	}
	
	public static int test1(int a, int b) {
		System.out.println("This is test");
		
		a=100;
		a=150;
		
		
		final int x=100;
		x=200;
		
		
		
		return a+b;
	}
	
	
	public final void m1() {
		System.out.println("This is m1");
	}
	
	


}
