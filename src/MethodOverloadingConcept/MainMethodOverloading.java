package MethodOverloadingConcept;

public class MainMethodOverloading {

	
	//JVM --- PSVM(String[]args)
	
	//main method will not return anything
	//main method will not take any input parameters other then string[]
	//main method is static
	
	public static void main(String[] args) {
	
		System.out.println("Hello");
		
		MainMethodOverloading.main(0);;
		
		

	}
	
	public static void main(int a ) {
		System.out.println("Hii..."+a);
	}
	
	public static void main(int a, int b) {
		System.out.println("Hello "+(a+b));
	}

}
