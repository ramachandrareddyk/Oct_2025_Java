package java_Sessions;

public class MathamaticalOperations {

	public static void main(String[] args) {
		
		System.out.println(1+2);//3
		
		System.out.println("1"+"2");//12
		
		System.out.println(10-5);//5
		
		System.out.println(10/2);//5
		System.out.println(9/2);//4
		
		//int /int=int
		//if any one of the number is decimal then the result will be decimal
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);//ArithmeticException
		//by 0 we can't devide any number
		//if we try to devide by 0 we will get AE
		//for decimal we will get Infinity
		//Infinity means the value is too large to represent
		
		System.out.println(9.0/0);//Infinity
		
		System.out.println(0/9);//0
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		//System.out.println(0/0);//ArithmeticException
		//System.out.println(-1/0);//ArithmeticException
		
		System.out.println(2/9);//0
		System.out.println(2.0/9);//0.2222222222222222
		
		System.out.println(0.0/0.0);//NaN --->Not a Number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//Nan
		System.out.println(0/9.0);//0.0
		
		//to get the divisable value we have to use /
		//to get the reminder value we have to use %
		
		System.out.println(10/2);//5
		System.out.println(10%2);//0
		System.out.println(9%2);//1
		
		System.out.println(99%5);//4
		System.out.println(10%0.0);//NaN
		
		System.out.println(0.1+0.2);//0.30000000000000004
		System.out.println(0.1+0.3);//0.4
		System.out.println(0.1+0.4);//0.5
		
		System.out.println(40.67f+2);
		
		double num=5.75;
		double num1=3.45;
		double sum=num+num1;
		
		System.out.println(sum);
		
	}

}
