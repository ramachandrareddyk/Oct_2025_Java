package java_Sessions;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		y=30;
		y=40;
		
		//int array
	//	int[] i=new int[4];
		int i[]=new int[4];
		System.out.println(i.length);
		i[0]=10;
		i[2]=20;
		i[3]=30;
		
		System.out.println(i[0]);//10
		System.out.println(i[1]);//0
	//	System.out.println(i[4]);//.ArrayIndexOutOfBoundsException: 
		
		System.out.println("LW index ="+ 0);
		System.out.println(i.length);//4
		System.out.println("H Index"+(i.length-1));
		//System.out.println(i[100]);//.ArrayIndexOutOfBoundsException:
		
		
		System.out.println(Arrays.toString(i));
		
		for(int z=0;z<i.length;z++) {//4
			System.out.println(i[z]);
		}
		System.out.println("--------------for each loop-----------");
		//for each loop
		for(int e:i) {
			System.out.println(e);
		}
		
		double[] d=new double[10];
		d[0]=23.4;
		d[1]=34.7;
		d[2]=56.8;
		d[8]=90.8;
	//	d[10]=87.9;//ArrayIndexOutOfBoundsException:
	//	System.out.println(d[10]);
		
		for(double a:d) {
			System.out.println(a);
		}
		
		System.out.println(Arrays.toString(d));
		
		char[] ch= new char[10];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		
		for(char e:ch) {
			System.out.println(e);
		}
		
		String names[]= new String[5];
		names[0]="Mahesh";
		names[1]="Suresh";
		names[2]="Kumar";
		names[3]="Manju";
		
		System.out.println(names[4]);//null
		
		for(int j=0;j<=names.length-1;j++) {
			System.out.println(names[j]);
		}
		
		Object[] empdata=new Object[5];
		empdata[0]="Kiran";
		empdata[1]=10003;
		empdata[2]=54067.90;
		empdata[3]='M';
		empdata[4]=true;
		
		for(int z=0;z<empdata.length;z++) {
			System.out.println(empdata[z]);
		}
		System.out.println("==============");
		
		for(Object e:empdata) {
			System.out.println(e);
		}
		System.out.println("===============");
		System.out.println(Arrays.toString(empdata));
		
		
		String ss[]=new String[9];
		System.out.println(Arrays.toString(ss));//
		
		
		String k[]= {"Java","Python","Selenium","C#"};
		System.out.println(k.length);//4
		
		int f[]= {10,20,30,40,50};
		
		int v[]=new int[10];
		v[0]=25;
		v[1]=35;
		v[2]=45;
		System.out.println(v);
		
	}

}
