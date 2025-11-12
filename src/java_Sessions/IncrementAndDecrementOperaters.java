package java_Sessions;

public class IncrementAndDecrementOperaters {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		//1+1=2
		//2+1=3
		
		//++  --
		
		//1. Post increment
//		int a=1;
//		int b=a++;
//		System.out.println(a);//2
//		System.out.println(b);//1
//		
//		int c=-98;
//		int d=c++;
//		System.out.println(c);//-97
//		System.out.println(d);//-98
//		
//		int e=0;
//		int f=e++;
//		System.out.println(e);//1
//		System.out.println(f);//0
//		
//		//2. Pre increment
//		int g=1;
//		int h=++g;
//		System.out.println(g);//2
//		System.out.println(h);//2
//		
//		int j=-100;
//		int k=++j;
//		System.out.println(j);//-99
//		System.out.println(k);//-99
//		
//		int l=100;
//		int m=++l;
//		System.out.println(l);//101
//		System.out.println(m);//101
//		
//		int n=100;
//		System.out.println(n);//100
//		int o=n++;
//		System.out.println(o);//100
//		System.out.println(n);//101
//		
//		//3. Post decrement
//		int x=2;
//		int y=x--;
//		System.out.println(x);//1
//		System.out.println(y);//2
//		
//		int v=-10;
//		int u=v--;
//		System.out.println(v);//-11
//		System.out.println(u);//-10
//		
//		//4. Pre decrement
//		int xx=2;
//		int yy=--xx;
//		System.out.println(xx);//1
//		System.out.println(yy);//1
//		
//		int z=-99;
//		int z1=--z;
//		System.out.println(z);//-100
//		System.out.println(z1);//-100
//		
//		int num=11;
//		System.out.println(--num);//10
//		System.out.println(num);//10
//		
//		int a1=23;
//		System.out.println(a1++);//23
//		System.out.println(a1);//24
		
		
		int i=11;
		int j=i++ + ++i;
		//    11+ 12-->13
		System.out.println(i);//13
		System.out.println(j);//24
		
		int a=11,b=22;
		int c=a + b + a++ + b++ + ++a + ++b;
		//	  11+22+11+22+13+24
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//		int x=0;
//		int y=x++ - --x + ++x -x--;
//		System.out.println(x);
//		System.out.println(y);
//		
//		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//		System.out.println(m);
//		System.out.println(p);
//		System.out.println(n);
//		
//		int a1=1;
//		int b1 = a1++ + ++a1 * --a1 - a1--; 
//		System.out.println(a1);
//		System.out.println(b1);
		
		
		char ch='A';
		System.out.println(ch++);//-->
		System.out.println(ch);
		
		
	
		
	}

}
