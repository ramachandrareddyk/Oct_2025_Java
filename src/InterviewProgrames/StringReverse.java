package InterviewProgrames;

public class StringReverse {
	
	public static void main(String[] args) {
		String x="Testing";
		
		int y=x.length();
		System.out.println(y);//7
		String rev="";
		for(int i=y-1;i>=0;i--) {
			rev=rev+x.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
	}

}
