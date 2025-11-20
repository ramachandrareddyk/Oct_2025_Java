package JavaSessions_1;

public class LoopsConcept {

	public static void main(String[] args) {
	//1-10
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("10");
		
		//1. While loop
		//2. For loop
		//3. do while loop
		//4. for each loop/enhaced for loop
		
	System.out.println("---------while loop-----------");
	//print 1 to 10 numbers
	int i=1;
	while(i<=10) {//10<=10 tru
		System.out.println(i);//12345678910
		//i++;//11
		//++i;
		i=i+1;
	}
	System.out.println("---------------------");
	int k=1;
	while(k<=50) {
		
	
		if(k%2==0) {
			System.out.println(k+"even number");
		//	System.out.println("Hello java...");
		}else {
			System.out.println(k+"odd number");
		}
		
		k++;
	}
	
	System.out.println("-------------for loop---------------");
	
	for(int x=1;x<=10;) {
		System.out.println(x);
		x++;
	}
	
	//10 to 1
	for(short b=10;b>=1;b--){
		System.out.println(b);//10987654321
	}
	
	for(char c='a';c<='z';c++) {
		System.out.println(c);
	}
	
	for(int z='A';z<='Z';z++) {
		System.out.println(z);
	}
	
	for(double d=2.5;d<=25;d++) {
		System.out.println(d);
	}
	
	for(int z=10;z<=100;z=z+5) {
		System.out.println(z);
	}
	
//	for(;;) {
//		System.out.println("Hello....");
//	}
	
//	for(int c=10;;c++) {
//		System.out.println("Hello....");
//	}
//	
	
//	for(int c=10;true;) {
//		System.out.println("Hello....");
//	}
	
	

	//do while loop
	int p=1;
	do {
		System.out.println(p);
		p++;
	}while(p<=10);
	
	
	
	
	
	
	
	
	
	}

}
