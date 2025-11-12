package java_Sessions;

public class TypecastingConcept {

	public static void main(String[] args) {
		
		//byte-->short-->int-->long
		byte b=10;
		short s=b;
		
		short s1=200;
		byte b1=(byte)s1;//200
		System.out.println(b1);//-56
		//
		//-128 to 127=>256
		//200-256=-56
		
		short s2=10;
		byte b2=(byte)s2;
		System.out.println(b2);//10
		
		byte t=10;
		int i=t;
		System.out.println(i);//10
		
		int j=1000;
		byte k=(byte)j;
		System.out.println(k);//
		//1000-256=744-256=488-256=232-256=-24
		
		
		int p=100;
		float f=p;
		System.out.println(f);//100.0
		
		float f1=23.33f;
		int p1=(int)f1;
		System.out.println(p1);//23
		
		
		
		int d=1000;
		double dd=d;
		System.out.println(dd);//1000.0
		
		char ch='a';
		int v=ch;
		System.out.println(v);//97
		
		int x=98;
		char c1=(char)x;
		System.out.println(c1);//b
		
		int x1=1500;
		char c2=(char)x1;
		System.out.println(c2);
		
		
		int x2=2200;
		char c3=(char)x2;
		System.out.println(c3);
		
		char w='a';
		short sh=(short)w;
		System.out.println(sh);
		
		
		

	}

}
