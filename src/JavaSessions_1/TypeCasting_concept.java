package JavaSessions_1;

public class TypeCasting_concept {
	
	public static void main(String[] args) {
	//byte short int long	
		
		byte b=10;
		short s=b;
		System.out.println(s);
		
		short s1=200;
		byte b1=(byte)s1;
		System.out.println(b1);//200    -56
		//-128 to 127=256
		//200-256=-56
		short s2=10;
		byte b2=(byte)s2;
		System.out.println(b2);//10
		
		int i=1000;
		//short s3=(short)i;
		//System.out.println(s3);
		
		byte b3=(byte)i;
		System.out.println(b3);//-24
		//1000-256=744-256=488-256=232-256=-24
		
		short s3=2000;
		int i1=s3;
		
		
		int p=100;
		float f=p;
		System.out.println(f);//100.0
		
		int p1=10000;
		double d=p1;
		System.out.println(d);//10000.0
		
		char ch='a';
		int p2=ch;
		System.out.println(p2);//97
		
		int p3=100;
		char ch1=(char)p3;
		System.out.println(ch1);//d
		
		
	}

}
