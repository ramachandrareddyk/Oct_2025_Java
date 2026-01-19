package MethodOverridingConcept;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a= new Dog();
		a.sound();
		
		Animal aa= new Animal();
		aa.sound();
		
		aa.food("FOx");
}

}
