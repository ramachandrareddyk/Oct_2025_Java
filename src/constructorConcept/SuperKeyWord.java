package constructorConcept;

public class SuperKeyWord {
	
	String color="White";
	
	public void m1() {
		System.out.println("This is m1 parent class");
	}
	
	public SuperKeyWord() {
		System.out.println("This is parent class constructor");
	}
	
	public SuperKeyWord(int age, String name) {
		System.out.println("This is parent class constructor");
	}

}
