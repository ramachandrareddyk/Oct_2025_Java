package constructorConcept;

public class ThisKeywordConcept {
	
	
	//this key word we will use to refer the current class objects
	
	//it is mainly used to differentiate b/w instance variables and local variables with same name
	
	int rollno;
	String name;
	double fee;
	
	public ThisKeywordConcept(int rollno, String name, double fee) {
		
		this.rollno= rollno;
		this.name= name;
		this.fee=fee;
		
	}
	
	public ThisKeywordConcept(int r,String n) {
		rollno=r;
		name=n;
	}
	
	public void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	public void m1() {
		System.out.println(rollno+" "+name);
	}
	
	public static void main(String[] args) {
		ThisKeywordConcept s1=new ThisKeywordConcept(101, "Ankit", 6000);
		ThisKeywordConcept s2=new ThisKeywordConcept(102, "Mahesh", 7000);
		ThisKeywordConcept s3= new ThisKeywordConcept(45, "Peter");
		
		s1.display();
		s2.display();
		
		s3.m1();
	}
	

}
