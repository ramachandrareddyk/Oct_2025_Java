package java_Sessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//String is a class: default class in java
		
		String name="Mahesh";
		
		//STring starts with capital S
		//String is a sequence of characters
		
		String num="300";
		String sp="@#$%^&";
		
		
		String x="Hello";
		String y="Selenium";
		
		int a=100;
		int b=200;
		
		double c=12.33;
		double d=12.44;
		
		System.out.println(a+b);//300
		System.out.println(x+y);//HelloSelenium
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x);//300Hello
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+a+b+y);//Hello100200Selenium
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(a+b+x+y+(a+b+c+d));//300HelloSelenium324.77
		
		System.out.println(x+y+a+b+c+d);//HelloSelenium10020012.3312.44
		System.out.println(a+c+b+d+x+y);//324.77HelloSelenium
		
		String s="300";
		String s1="400";
		
		System.out.println(s+s1);//300400
		System.out.println(a+s+b+s1);//100300200400
		
		System.out.println(a+b+s+s1);//300300400
		
		System.out.println("The value of a :"+a);
		System.out.println("The value of b :"+b);//200
		
		System.out.println("The sum of a and b is :"+(a+b));//
		
		char ch='a';
		String str="Selenium";
		System.out.println(str+ch);//Seleniuma
		char c1='a';//97
		char c2='b';//98
		System.out.println(str+c1+c2);//Seleniumab
		
		System.out.println(c1+c2);//97+98=195
		
		System.out.println(c2-c1);//1
		
		String ss="a";
		String ss1="b";
		System.out.println(ss+ss1);
		
		//range:
		//a-z= 97 - 122
		//A-Z= 65 - 90
		//0-9= 48-57
		
		System.out.println('A'+'B');////65+66=131
		System.out.println(c1+c2+'0'+'A');//97+98+48+65=
		
		System.out.println(c1);//a
		
		System.out.println((byte)c1);//97 to print the ASCCI value of a
		System.out.println((byte)'@');
		
		System.out.println('a'+0);
		System.out.println('$'+0);
		
		System.out.println('a'+10+20-10);//117
		System.out.println("Ramesh "+'M');//
		
		System.out.println('M'+" Ramesh");
		
		System.out.println('a'+'c'+"Hello"+10+20);
		
		System.out.println('a'+'c'+"Hello"+(10+20));
		
		boolean flag=true;
		String u="Yes";
		System.out.println(flag+u);//trueyes
		
		System.out.println("a"+"b");//ab
		System.out.println('a'+'b');//195
		
		System.out.println('a'+200);//97+200=297
		System.out.println("a"+200);//a200
		System.out.println('a'+"200");//a200
		
		
		

	}

}
;