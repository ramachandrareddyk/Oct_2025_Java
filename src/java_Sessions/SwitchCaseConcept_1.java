package java_Sessions;

public class SwitchCaseConcept_1 {

	public static void main(String[] args) {

		String name = "Mahesh";
		switch (name) {
		case "Ramesh" :
			System.out.println("He is Ramesh");
		case "Kumar":
			System.out.println("He is Ramesh");
		case "Manju":
			System.out.println("He is Ramesh");
		case "Mahesh":
			System.out.println("He is Mahesh");
		case "Kiran":
			System.out.println("He is Kiran");
		default:
			System.out.println("Nooooo......");

		}

		int num = 0;
//		num--;
//		num--;
//		num--;

		System.out.println(num);

		int num1 = --num + --num + --num;
		System.out.println(num1);
		int a = 0;
		a -= 3;
		System.out.println(a);
		System.out.println();

	}

}
