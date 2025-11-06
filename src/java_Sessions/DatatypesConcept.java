package java_Sessions;

public class DatatypesConcept {

	public static void main(String[] args) {
		//Data Types:
		
		//1. Primitive data types: All are reserved data types
		//without creating an object we can it
			//Numaric type:
				//Integral family:
					//Integer type: byte, short, int, long
					//floating type: float, double
				//Character: char $, A, 3
			//Boolean type: boolean (true/false)
		
		//java memory in the form of bytes and bits
		//1. byte:
		//size: 1 byte = 8 bits
		//range:-128 to 127
		
		byte b=10;
		//byte: Data type
		//b variable name/Refarence
		//= Assignement operater
		//10 value
		System.out.println(b);//10
		//byte b=20; dubplicate variables are not allwed in java
		b=20;
		System.out.println(b);//20
		b=30;
		System.out.println(b);//30
		
		byte b3=-20;
		System.out.println(b3);
		byte b1=127;
		byte b2=-128;
		//byte b4=10.0; decimal values are not allowed
		
		System.out.println(b+" "+b1+" "+b2+" "+b3);
		
		
		//2. Short:
		//size: 2 bytes : 16 bits
		//range: -32768 to 32767(-2^15 to 2^15-1)
		
		short s = 500;
		short s1=32767;
		System.out.println(s);
		short s2=1;//2 bytes
		
		//3.int:
		//size: 4 bytes : 32 bits
		//range: -2^31 to 2^31-1  2147483648 to 2147483647
		int i=3500;
		System.out.println(i);
		int i1=25;//4 bytes
		
		
		//4. long:
		//size: 8 bytes:64 bits
		//range: -2^63 to 2^63-1
		
		long l=123456789;
		//long l2=12345678992;//give an error:  because by default compiler consider it as int
		
		long l3=124567898989L;
		
		//Account number, Aadhar number, SSN, Mobile---String
		
		//dastence, Population, Starts in universe, you tube likes, Subscribers
		
		//5. float
		//size: 4 bytes : 32 bits
		//range: after . it can take up to 6 -7 decimal digits up to 39
		float x=35.4f;
		float x1=(float)23.4;//costing to float
		float x2=345.1234567888888888880000f;
		float x4=12000.0000000000000000000000000000000000000000000000000000000000000000000f;
		System.out.println(x);
		float x3=200;//200.0
		System.out.println(x3);
		
		//6. double:
		//size: 8 bytes: 64 bits
		//after decimal 15
		
		double d=345.90;
		double d1=123456789999999999.99999999999999999999999999999999999999999999999999999999999999999999999999999;
		
		//7. char:
		//size: 2 bytes: 16 bits
		//
		
		char c='A';
		char c1='1';
		char c2='#';
		char c3=' ';
		char c4='d';
		
		
		//8. boolean true/false
		//size ~1 bit
		boolean t=true;
		boolean t1=false;
		//2. Non Primitive data types: We have to create the object
		//Ex: Class, Interface, Arrays, Object, String, Allrylist

	}

}
