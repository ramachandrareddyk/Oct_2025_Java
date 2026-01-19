package AccessModifiersConcept;

public class Car {
	
	int a=10;
	int b=20;
	
	
	
	
	void m1() {
		System.out.println("Hello");
	}
	
	
	private int x=20;
	private String name="Rajesh";
	
	private void m2() {
		System.out.println("This is private method");
	}
	
	protected int price=67000;
	protected String city ="Bangalore";
	
	protected void m3() {
		System.out.println("This is protected method");
	}
	
	public int age=45;
	public void m4()
	{
		System.out.println("This is public method");
	}
	public static void main(String[] args) {
		Car c= new Car();
		
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		
		
		c.m2();
		System.out.println(c.x);
		System.out.println(c.name);
		
		c.m3();
		System.out.println(c.city);
		
		c.m4();
				
	}
	
}