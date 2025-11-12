package java_Sessions;

public class LoopsConcept {

	
	public static void main(String[] args) {
		// 1 to 10
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		
		//1. while loop
		//2. for loop
		//3. do while loop
		//4. enhanced for loop/for each loop
		
		//1. while loop
		System.out.println("-------------While loop--------------");
		
		int i=1;
		while (i<=10) {//11<=10 false
			System.out.print(i);//12345678910
			//i++;
			//++i;
			i=i+1;
		}
		System.out.println();
		System.out.println("-----------------------");
		int k=1;
		while(k<=50) {
		
			System.out.print(k);
			k++;
		}
		System.out.println();
		System.out.println("-----------------------");
		int p=10;
		while(p<=200) {//10<=200 true
			System.out.print(p);//10
			if(p%20==0) {//true
				break;
			}
			p++;
		}
		
		System.out.println();
		System.out.println("------------------------");
		int t=10;
		while(t>=-1) {
			
			System.out.print(t);

			//t--;
			//--t;
			t=t-1;
			break;// after break statement we can't write any statements

		}
		System.out.println();
		System.out.println("=========for loop=========");
		
		for(int x=1;x<10;x++) {
			System.out.println(x);
		}
		
		for(short s=1;s<=100;s++) {
			System.out.println(s);
		}
		
		int z=1;
		for(int y=z;y<=10;) {
			System.out.println(y);
			y++;
		}
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch+" = "+(byte)ch);//a-z
		}
		
		for(int x='a';x<='z';x++) {
			System.out.println(x);//ascci values of a-z
		}
		
		for(double d=1.0;d<=10.0;d++) {
			System.out.println(d);
		}
		int x=10;
//		for(int x=1;;x++) {
//			System.out.println(x);//
//		}
		
//		for(;;x++) {
//			System.out.println(x);
//		}
//		
//		for(;;) {
//			System.out.println(x);
//		}
		
		//When to use while loop
		//1. iterations are not fixed then use while loop
		//handling the calender
		//infinite scrolling
		//wait for elements on the page:5 10 15 20
		//wait for loading a page
		
		//When to use for loop
		//1. iterations are fixed then use for loop
		//2. Dropdowns: month, date , year
		//3. array, arraylist
		//4. footer links
		
		//3. do while loop
		
		int m=10;
		do {
			System.out.println(m);
			m++;
		}while(m<=20);
	}
	
	//1. find the largest and smalest value in given numbers
		int p=20;
		int r=2;
		int q=67;
		int t=89;
		int w=9;
	//2. print even and odd numbers up to 100
	//3. print 9th table 9x1=9
	//4. print prime numbers up 100
		
}
