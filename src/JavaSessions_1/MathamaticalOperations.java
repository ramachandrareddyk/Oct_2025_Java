package JavaSessions_1;

public class MathamaticalOperations {

	static byte a;
	static char c;
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+ - * / %
		
		System.out.println(1+2);//3
		System.out.println(10-5);//5
		System.out.println(10*5);//50
		
		int x=10;
		int y=5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		
		System.out.println(10/2);//5
		
		System.out.println(9/2);//4
		//int/int=int
		
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
		//System.out.println(9/0);//ArithmeticException
		System.out.println(0/9);//0
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		//System.out.println(0/0);//ArithmeticException
		
		//System.out.println(-1/0);//ArithmeticException
		
		System.out.println(0.0/0.0);//NaN: Not a Number
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		
		System.out.println(9%2);//1
		System.out.println(10%2);//0
		System.out.println(100%4);//0
		//System.out.println(9%0);//ArithmeticException
		System.out.println(0%9);//0
		
		System.out.println(100);//4 bytes
		System.out.println((byte)100);//1 bytes
		
		System.out.println(0.1+0.2);//0.3
		System.out.println(0.2+0.3);//0.5
		System.out.println(0.3+0.4);//0.7
		
		System.out.println(5.75+100);//105.75
		
		//defaultvalues
		//byte=0 short, int, long:0
		System.out.println(a);
		
		//float, double :0.0
		System.out.println(c);
		//char: space
		//boolean: false
		System.out.println(s);
		//String: null
		
		
		
		
	}

}
