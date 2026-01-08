package InheritenceConcept;

public class B extends A{
	
	
	//class a is the parent class/super class
	//class b is the child class/sub class
	
	// we are extending class A properties to class B
	
	public static void main(String[] args) {
		
		A.m1();
		
		A a= new A();
		a.test();
		a.details();
		
		
		B.m1();
		B b= new B();
		b.test();//A
		b.details();//A
		
	}
	
	public void exam() {
		System.out.println("This java exam");
	}
	
	public void mobile() {
		System.out.println("This is mobile");
	}

}
