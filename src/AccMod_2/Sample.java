package AccMod_2;

import AccessModifiersConcept.Car;

public class Sample extends Car{
	
	public static void main(String[] args) {
		Sample s= new Sample();
		
		
		s.m3();
		int price=s.price;
		String city=s.city;

		
		s.m4();
	}

}
