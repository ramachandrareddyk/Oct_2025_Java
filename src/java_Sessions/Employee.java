package java_Sessions;

public class Employee {
	
	//Oops
			//-----
			//Class--Template/Bluprint/Catagory
			//Class contains Veriables, Method, Constructors and blocks
			//Object
			//Inheritence
			//Encpsulation
			//Abstraction
			//Interface
	
	//Types of variables
	//1. Local variables--Variables are created inside the method/constructor--We can access only inside the method and constructor
	//2. Intence/global variables
	
	String name;
	int age;
	double salary;
	boolean isperm;
	char gender;
	
	int id=101;

	public static void main(String[] args) {
		
		int x=10;
		String name="Ramesh";
		
		System.out.println(x);
	//to create the object : use new keyword
		
		Employee emp = new Employee();//RHS
		//Employee: is a class
		//emp: Object reference name
		//new: is a keyword to create an object
		//Employee(): This is the object/instence of class
		
		//new employee(): this will create the object in heap memory and 
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println(emp.isperm);
		System.out.println(emp.gender);
		
		System.out.println("=========");
		emp.name="Pooja";
		emp.salary=90000.90;
		emp.age=30;
		emp.isperm=true;
		emp.gender='F';
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println(emp.isperm);
		System.out.println(emp.gender);
		
		Employee emp1= new Employee();
		emp1.name="Ravi";
		emp1.age=34;
		
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary+" "+emp1.isperm+" "+emp1.gender);
		
		emp1.gender='M';
		
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary+" "+emp1.isperm+" "+emp1.gender);
		
		//object creation without ref
		new Employee().name="Tom";
		new Employee().age=45;
		
		//when you create object without any refarence we can't re use it
		
		System.out.println(new Employee().name);
		
		Employee emp2= new Employee();
		emp2= null;
//		
//		emp2.name="Chandra";
//		emp2.age=45;
//		
//		System.out.println(emp2.age);
//		System.out.println(emp2.name);
		
		System.gc();
		
		Employee p1;
		p1= new Employee();
		
		String s=null;
		System.out.println(s.equals("Kumar"));//
		
		
		
				
		

	}

}
