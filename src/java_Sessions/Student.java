package java_Sessions;

public class Student {

	String name;
	int age;
	String subject[];
	
	
	public static void main(String[] args) {
		Student s= new Student();
		s.name="Shiva";
		s.age=30;
		s.subject= new String[3];//{"java","Python","C#"}
		
		s.subject[0]="Java";
		s.subject[1]="Python";
		s.subject[2]="C#";
	

	}

}
