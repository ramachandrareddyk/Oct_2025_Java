package constructorConcept;

public class Super1 extends SuperKeyWord{
	
	String color="Black";
	
	public void printColor() {
		System.out.println(color);//black
		System.out.println(super.color);//white
	}
	
	public void m1() {
		System.out.println("This is m1 child class");
	}
	
	public void m2() {
		System.out.println("Heloo....");
	}
	
	public void test() {
		super.m1();
	}
	
	public Super1() {
		
		//super();
		super(34,"Harish");
		System.out.println("this is chaild class const");
	}
	
	

}
