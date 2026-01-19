package MethodOverridingConcept;

public class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("Dog is barks");
	}
	
	
	public void food() {
		System.out.println("Dog eats Non veg");
	}
	
	@Override
	public String AnimalType(String Animal, int Legs) {
		System.out.println("ANiamal name is "+Animal+" having "+Legs+" legs");
		
		return null;
	}
	
	public static void test() {
		System.out.println("This is test");
	}
	

	public static int test1(int a, int b) {
		System.out.println("This is test");
		return a+b;
	}
	
	public final void m1() {
		System.out.println("This is m1");
	}



}
