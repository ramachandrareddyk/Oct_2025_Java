package java_Sessions;

public class IfElseConcept {

	public static void main(String[] args) {

		// to campare primitive data type: ==
		// to compare non premitive data types we have to use : .equals();

		System.out.println(100 == 20);// false

		System.out.println("100" == "200");// false
		System.out.println("100".equals("100"));

		System.out.println("===============if condition===============");
		int a = 100;
		int b = 20;

		if (a > b) {
			System.out.println(" a is gr then b");
		}
		System.out.println("===============if else condition===============");
		if (a > b) {
			System.out.println(" a is gr then b");
		} else {
			System.out.println(" b is gr then a");
		}

		if (false) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye...");
		}

		if (10 < 20) {
			System.out.println("Hello....");
		}

		boolean flag = true;
		if (flag) {
			System.out.println("Hello java");
		} else {
			System.out.println("Hello Selenium");
		}

		boolean headless = true;
		if (headless) {
			System.out.println("Run TC in headless mode");
		} else {
			System.out.println("Run TC in normal mode");
		}

		System.out.println("===============nested if else condition===============");

		int marks = 100;
		if (marks <= 100) {
			if (marks >= 90) {
				System.out.println("Grade A");
				if (marks > 95) {
					System.out.println("100% free no fee");
					if (marks == 100) {
						System.out.println("Grade A++ and No tuestion fee");
					} else {
						System.out.println("10% fee");
					}
				}
			}

		} else {
			System.out.println("Invalid marks");
		}

		System.out.println("=============== if else if condition===============");

		String browser = "Opera";

		if (browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}

		if (browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}

		if (browser.equals("Safari")) {
			System.out.println("Launch Safari browser");
		}

		if (browser.equals("Edge")) {
			System.out.println("Launch Edge browser");
		}

		if (browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		} else if (browser.equals("Safari")) {
			System.out.println("Launch Safari browser");
		} else if (browser.equals("Edge")) {
			System.out.println("Launch Edge browser");
		} else {
			System.out.println("Invalid browser plese pass the correct browser");
		}

		int total = 75;
		if (total <= 100) {
			if (total <= 80) {
				System.out.println("Hello...");
				if (total == 100) {
					System.out.println("Hello Java");
				} else {
					System.out.println("exit with 3");
				}
			} else {
				System.out.println("exit with 2");
			}
		} else {
			System.out.println("exit with 1");
		}
		
		System.out.println(10%5);

		
		
		if(10>20 && 10>5  && 10==10) {
			System.out.println("Hello java ");
		}
		
		if(10>20 || 10>5  || 10==10) {
			System.out.println("Hello selenium");
		}
	}
	

}
