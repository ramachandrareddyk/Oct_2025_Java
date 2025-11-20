package DynamicArray;

import java.lang.reflect.Array;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());//4
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());//6
		
		System.out.println("LI+"+0);
		System.out.println("HI="+(ar.size()-1));
		
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(3));//400
		ar.remove(3);
		System.out.println(ar.get(3));//500
		System.out.println(ar.size());//5
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		System.out.println("-----");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		
		ArrayList arr= new ArrayList();
		arr.add(100);
		arr.add('@');
		arr.add("Testing");
		arr.add(true);
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(100);
		
		for(Integer e:marks) {
			System.out.println(e);
		}
		
		double d=300;
		
		ArrayList<Double> price=new ArrayList<Double>();
		price.add(34.8);
		price.add(34.6);
		price.add(34.4);
		
		ArrayList<Byte> b= new ArrayList<Byte>();
		
		ArrayList<Short>s= new ArrayList<Short>();
		ArrayList<Long>l= new ArrayList<Long>();
		
		ArrayList<String>Browsernames= new ArrayList<String>();
		Browsernames.add("chrome");
		Browsernames.add("edge");
		Browsernames.add("safari");
		for(String e:Browsernames) {
			System.out.println(e);
				if(e.equals("edge")) {
					System.out.println("Launch edge browser");
					break;
				}
			
		}
		
		ArrayList<Object>studentData= new ArrayList<Object>();
		
		studentData.add("Mahesh");
		studentData.add(10028);
		studentData.add('M');
		studentData.add(true);
		
		for(Object e:studentData) {
			System.out.println(e);
		}
		
		
		

	}

}
