package basics;

public class StingConstructers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String(); //empty String Con
		System.out.println(s);
		
		String s1 = new String("hello"); // string literal Con
		System.out.println(s1);
		
		//String s2= new String(StringBuffer sb); //for given String buffer need to create equvalent String

		//String s3 = new String(StringBuilder sb);
		
		char [] ch = {'j','a','v','a'};
		String s4 = new String(ch); //String is a sequence of char array
		System.out.println(s4);
		
		byte [] b= {97,98,99,100};
		String s5 = new String(b);
		System.out.println(s5);

	}

}
