package java_Sessions;

public class Car1 {
	
	String EngineNum;
	int SeatingCapacity;
	int milage;
	
	static final int dors=5;
	
	public static void main(String[] args) {
		Car c1= new Car();
		c1.name="Maruuthi";
		c1.price=1000000;
		c1.modalNumber="890rty3456";
		c1.color="White";
	
		
		System.out.println(Car.wheels);
		System.out.println(Car.keys);
		
		System.out.println(Car1.dors);
		
		Car1 cc= new Car1();
		cc.EngineNum="";
		cc.SeatingCapacity=5;
		cc.milage=15;
	}

}
