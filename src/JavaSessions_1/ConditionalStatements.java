package JavaSessions_1;

public class ConditionalStatements {

	public static void main(String[] args) {
		System.out.println(10==10);

		System.out.println(10==20);
		
		int a=10;
		int b=100;
		System.out.println(a==b);
		
		//if
		if(a==b) {
			System.out.println("both are equal");
		}
		
		if(a==b) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}
		
		if(a<b) {
			System.out.println("Hello...");
		}else {
			System.out.println("Bye....");
		}
		
		if(a>b) {
			System.out.println("Hello...");
		}else {
			System.out.println("Bye....");
		}
		
		if(false) {
			System.out.println("Java...");
		}else {
			System.out.println("Selenium....");
		}
		
		boolean f=true;
		
		if(f) {
			System.out.println("Java...");
		}else {
			System.out.println("Selenium....");
		}
		
		//nested if condition
		int marks=96;
		if(marks>=35) {
			System.out.println("Pass");
			if(marks>80) {
				System.out.println("Grade A");
				if(marks>95) {
					System.out.println("Grade A++ 50% discount on fee");
				}
			}
		}else {
			System.out.println("Fail");
		}
		
		
		//100 TCs  facebook application
		String browser="chrome";
		
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}else{
			System.out.println("Not chrome");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}else{
			System.out.println("Not firefox");
		}
		
		if(browser.equals("ie")) {
			System.out.println("Launch ie browser");
		}else{
			System.out.println("Not ie");
		}
		
		if(browser.equals("safari")) {
			System.out.println("Launch safari browser");
		}else{
			System.out.println("Not safari");
		}
		
		browser="firefox";
		//if else if
		if(browser.equals("chrome")) {
			System.out.println("Launch chrome browser");
		}else if(browser.equals("firefox")) {
			System.out.println("Launch firefox browser");
		}else if(browser.equals("ie")) {
			System.out.println("Launch ie browser");
			
		}else if(browser.equals("safari")) {
			System.out.println("Launch safari browser");
		}else{
			System.out.println("Please pass the correct browser name");
		}
		
	}

}
