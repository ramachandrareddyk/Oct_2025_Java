package JavaSessions_1;

public class StringConcatenationConcept {

	public static void main(String[] args) {
		
		
		String name="Mahesh";
		String num="200";
		String sp="!@#$%^&*";
		
		String x="Hello";
		String y="Selenium";
		
		int a=10;
		int b=20;
		
		double d=12.33;
		double c=12.44;
		
		System.out.println(a+b);//30
		System.out.println(x+y);//HelloSelenium
		System.out.println(x+a);//String+in=Concatenation: String   Hello10
		System.out.println(a+b+x+y);//30HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium1020
		System.out.println(x+y+(a+b));//HelloSelenium30
		System.out.println(x+a+b+y);//Hello1020Selenium
		System.out.println(a+b+x+y+a+b);//30HelloSelenium1020
		
		System.out.println(a+b+x+y+(a+b+c+d));//30HelloSelenium54.769999999999996
		System.out.println(a+b+c+d+x+y);//54.769999999999996HelloSelenium
		
		String m="10";
		String n="20";
		System.out.println(m+n);//1020
		System.out.println(a+m+n+b);//10102020
		
		System.out.println("The value of a :"+a);
		
		System.out.println("The value of a+b :"+(a+b));
		
		
		char ch='a';
		String str="Selenium";
		System.out.println(str+ch);//Seleniuma
		
		char c1='a';
		char c2='b';
		System.out.println(c1);//a
		System.out.println(c2);//b
		System.out.println(c1+c2);//96+97=195
		
		System.out.println('A'+'B');//65+66
		System.out.println(c1+c2+'0'+"0"+0);//96+97+48==24300
		System.out.println(str+c1+c2);//Seleniumab
		
		System.out.println(str+(c1+c2));//Selenium195
		
		System.out.println((byte)c1);//96
		System.out.println((byte)'@');//64
		
		System.out.println('a'+0);//97
		
		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+45+'b');//366Helloa45b
		String s1="a";
		String s2="b";
		System.out.println(s1+s2);//ab
		
		boolean b1=true;
		String u="Yes";
		System.out.println(b1+u);//trueYes
		System.out.println("a"+"b");//ab
		System.out.println('a'+'b');//196

		

	}

}
