package java_Sessions;

public class SitchCaseConcept {

	public static void main(String[] args) {

		String browser = "iee";
		String version = "121";

		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;

		case "firefox":
			System.out.println("Launch firefox browser");
			break;

		case "ie":
			System.out.println("Launch ie browser");
			break;
		default:
			System.out.println("Invalid browser plese pass the correct browser");
			break;

		case "safari":
			System.out.println("Launch safari browser");
			break;

		// int, char, String, byte and short

		// long float and double

		}

		// 1 to 100
		int marks = 100;
		switch (marks) {
		case 1:

			break;

		case 2:

			break;

		case 3:

			break;

		case 4:

			break;

		default:
			break;
		}

		char ch = 'c';
		switch (ch) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println(ch + " is a consonent");

		}

		// cross browser testing
		// crss os
		// month
		// week
		//
	}

}
