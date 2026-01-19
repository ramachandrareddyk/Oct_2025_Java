package EncapsulationConscept;

public class EmpTest {

	public static void main(String[] args) {
	//	Employee emp= new Employee();
		
//		emp.setName("Tom");
//		String n=emp.getName();
//		
//		System.out.println(n);
//		
//		emp.setAge(20);
//		System.out.println(emp.getAge());
		
		//Create--Post
		Employee emp=new Employee("Pooja", 34, 67000, true);
		
		//Retrieve - Get
		System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary()+" "+emp.isPerm());
		
		//Update -- PUT
		emp.setAge(36);
		emp.setSalary(80000);
		
		//Retrieve - Get
			System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary()+" "+emp.isPerm());

	}

}
