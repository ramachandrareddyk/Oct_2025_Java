package constructorConcept;

public class Employee {
	
	
	String name;
	int age;
	double salary;
	char gender;
	String DOB;
	boolean isPerm;
	String city;
	
	
	//Const is the special method in java
		//Looks like a method
		//const we will to initialize the objects when  a class  is created
	
	//constructor name must be the class name
	//Const will not return any thing and it can't be void also
	//COnstructor will execute at the creation of object
	
	//if we are not creating any constructor JVM is going to create the default cont....at the time of execution
	
	//can we overload the const...: yes we can over load
	
	//const.. will help us to restrict the object creation
	
	//Types of constructors
	//1. Defualt constructor
	//2. Parameterised const...
	


	
//	public Employee() {
//		System.out.println("This is constructor");
//	}
	
//	public Employee(int a) {
//		System.out.println("1 param const...."+a);
//	}
//	
//	public Employee(String name) {
//		System.out.println("1 param const...."+name);
//	}
//	
//	public Employee(int a, String name) {
//		System.out.println("2 param const...."+a+" "+name);
//	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age= age;
		
	}
	public Employee(String name, int age, double salary,char gender, String DOB, String city) {
		this.name=name;
		this.age= age;
		this.salary=salary;
		this.gender=gender;
		this.DOB=DOB;
		this.city=city;
		
		
	}
	
	public void test() {
		System.out.println(name+" "+age+" "+salary+" "+gender+" "+DOB+" "+city);
	}
	
	public static void main(String[] args) {

		
		Employee emp= new Employee("Peter", 34);
		System.out.println(emp.name);
		System.out.println(emp.age);
		
		Employee emp1= new Employee("Peter", 35, 56000, 'M', "25/06/1995", "Banglore");
		Employee emp2= new Employee("Json", 37, 56000, 'M', "25/06/1995", "Banglore");
		
		emp1.test();
		emp2.test();
		
		
	}

}
