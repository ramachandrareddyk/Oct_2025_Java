package java_Sessions;

public class Car {
	
	String name;
	int price;
	String modalNumber;
	String color;
	
	static final int wheels=4;
	static final int keys=2;
	
	//days in a week
	//months

	public static void main(String[] args) {
	
		Car c1= new Car();
		c1.name="BMW";
		c1.price=3500000;
		c1.modalNumber="5678tyui789";
		c1.color="White";
		
		Car c2= new Car();
		c2.name="Audi";
		c2.price=2500000;
		c2.modalNumber="567ty6789ui789";
		c2.color="Black";
		
		Car c3= new Car();
		c3.name="Honda";
		c3.price=1500000;
		c3.modalNumber="23456789UTIL98765";
		c3.color="Red";
		
		//how to access static variables
		//1. using the class name
		System.out.println(Car.wheels);
		
		//2.using directly
		System.out.println(wheels);System.out.println(keys);
		
		//3. using class instence/Object
		System.out.println(c1.wheels);
		
		
		System.out.println(c1.name+" "+c1.modalNumber+" "+c1.price+" "+c1.color+" "+Car.wheels+" "+Car.keys);	
		System.out.println(c2.name+" "+c2.modalNumber+" "+c2.price+" "+c2.color+" "+Car.wheels+" "+Car.keys);
		System.out.println(c3.name+" "+c3.modalNumber+" "+c3.price+" "+c3.color+" "+Car.wheels+" "+Car.keys);
		
		

	}

}
