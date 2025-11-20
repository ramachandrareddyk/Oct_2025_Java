package java_Sessions;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		User u1= new User();
		u1.name="Veena";
		u1.age=24;
		u1.city="Banglore";
		
		User u2= new User();
		u2.name="Peter";
		u2.age=46;
		u2.city="Byderabad";
		
		User u3= new User();
		u3.name="Mahesh";
		u3.age=34;
		u3.city="Pune";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		System.out.println("================");
		u1=u2;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//
		
		System.out.println("================");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//
		
		u3=u1;
		System.out.println("================");
	
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//Peter
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//Mahesh
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//veena/mesh/
		
		

	}

}
