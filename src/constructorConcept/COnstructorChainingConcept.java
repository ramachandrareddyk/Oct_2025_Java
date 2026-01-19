package constructorConcept;

public class COnstructorChainingConcept {

	public COnstructorChainingConcept() {
		System.out.println("This is default cont");
	}

	public COnstructorChainingConcept(int a) {
		this();
		System.out.println("This is integer cont");
	}

	public COnstructorChainingConcept(String b) {
		this(56);
		System.out.println("This is STring cont");
	}

	public COnstructorChainingConcept(double d) {
		this("Ramesh");
		System.out.println("This is double cont");
	}

	public static void main(String[] args) {
		COnstructorChainingConcept c= new COnstructorChainingConcept(67.9);

	}

}
