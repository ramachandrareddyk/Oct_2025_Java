package JavaSessions_1;

public class IncrementAndDecrementOperaters {

	public static void main(String[] args) {
		
//		int i=1;
//		i=i+4;
//		System.out.println(i);
//		
//		// ++  and --
//		
//		//1. Post increment
//		int a=1;//+1
//		System.out.println(a);//1
//		int b=a++;
//		
//		System.out.println(a);//2
//		System.out.println(b);//1
//		
//		int c=-98;
//		int d=c++;
//		
//		System.out.println(c);//-97
//		System.out.println(d);//-98
//		
//		int e=0;
//		int f=e++;
//		System.out.println(e);//1
//		System.out.println(f);//0
//		
//		
//		//2. Pre increment
//		int g=1;//+1=2
//		int h=++g;
//		System.out.println(g);//2
//		System.out.println(h);//2
//		
//		int k=-100;//-100+ 1=-99
//		int l=++k;
//		System.out.println(k);//-99
//		System.out.println(l);//--99
//		
//		int m=-1;
//		int n=m++;
//		System.out.println(m);//0
//		System.out.println(n);//-1
//		
//		//3. Post decrement
//		int o=10;
//		int p=o--;
//		System.out.println(o);
//		System.out.println(p);
//		
//		
//		//4. pre decrement
//		int q=-99;
//		int r=--q;
//		System.out.println(q);
//		System.out.println(r);
//		
//		int x=11;
//		int y=x++ + ++x;
//		System.out.println(x);//
//		System.out.println(y);//
		
//		int a=11;
//		int b=22;
//		int c=a + b + a++ + b++ + ++a + ++b;
//		System.out.println(a);//1
//		System.out.println(b);//22
//		System.out.println(c);//99
		
		int i=0;
		int j = i++ - --i + ++i - i--;
		System.out.println(i);
		System.out.println(j);
		
		
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;

		System.out.println(m);
		System.out.println(p);
		System.out.println(n);

		int a=1;
		int b = a++ + ++a * --a - a--; 
		
		//      1  + 3 * 2- 2
		
		System.out.println(a);
		System.out.println(b);
		
	

	}

}
