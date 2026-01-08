package java_Sessions;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionsInJava {

	//Functions/Methods
	
	//No input no return
	//no input  with return
	//input with return
	//input with no return
	
	int x=100;
	
	int age;
	static int z=200;
	
	public static void main(String[] args) {
	
		FunctionsInJava ff= new FunctionsInJava();
		System.out.println(ff.x);
		ff.test();
		ff.test1();
		
		int z=ff.add();
		System.out.println(z);
		
		//System.out.println( ff.add());
		
		int sumvalue=ff.sum(100, 2000);
		System.out.println(sumvalue);
		
		ff.addition(56, 78);
		
		FunctionsInJava.m1("Test user ", "Automation tester");
		
		double tax=ff.taxCal(1800000);
		System.out.println(tax);
		String[]ss=ff.gettestData();
		for(String e:ss) {
			System.out.println(e);
		}
		
		
		ArrayList<String>data= ff.getStudentData();
		for(String e:data) {
			System.out.println(e);
		}
		
		System.out.println("Student Name is "+ff.getStudentName());

	}
	
	//No input no return
	
	//we can't able to write method inside the any method
	//duplicate methods are not allowed
	
	public void test() {
		System.out.println("This is test method");
	}
	
//	public void test() {
//		
//	}
//	
	public void test1() {
		System.out.println("This is test1 method");
		
//		public void m1() {
//			
//		}
	}
	
	
	
	//no input with some return
	
	//void and return can't able to use in same time
	//void- no return, function does not return any thing
	//void is a key word
	
	
	public int add() {
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
	}
	
	public String getEmpName() {
		String name="Peter";
		return name;
	}
	
	public boolean isUserActive() {
		System.out.println("Checking the user status");
		return true;
	}
	
	//input with return
	public int sum(int a, int b) {
		return a+b;
	}
	
	//input  but there is no return
	public void addition(int a, int b) {
		System.out.println("Adding two numbers");
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void m1(String s, String k) {
		System.out.println(s+k);
	}
	
	public int taxCal(double salary) {
		int tax=0;
		if(salary<=1200000) {
			System.out.println("no tax");
			return tax;
		}else if(salary>1200000 && salary<=1600000) {
			System.out.println("tax amount is 50000");
			tax=50000;
			return tax;
		}else {
			System.out.println("tax amount is 100000");
			tax=100000;
			return tax;
		}
	}
	
	public String[] gettestData() {
		System.out.println("taking test data from DB");
		String []userData= {"Mahesh","Java Devloper","Cognizent","Bangalore"};
		return userData;
	}
	
	
	public ArrayList<String> getStudentData() {
		ArrayList<String>data= new ArrayList<String>();
		data.add("Tharun");
		data.add("SVCS");
		return data;
	}
	
	public String getStudentName() {
		Scanner sc= new Scanner(System.in);
		System.out.println("eneter student name");
		String name=sc.nextLine();
		
		return name;
		
	}

}
