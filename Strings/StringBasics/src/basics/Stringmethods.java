package basics;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String(); // empty String Con
		System.out.println(s.isEmpty()); // true

		String sl = "STRINGS";
		System.out.println(sl.length());

		String s2[] = { "abb", "bbc", "cccw" }; ///array we use lenth variable
		System.out.println(s2.length);  //7
		System.out.println(sl.replace("TR", "")); //SINGS
		System.out.println(sl.substring(2));      //RINGS
		System.out.println(sl.indexOf('I'));      //3
		
		
		System.out.println(sl.lastIndexOf('S'));  //6
		
		System.out.println(sl.toLowerCase());  //strings
		
		String su ="strings";
		System.out.println(sl.equalsIgnoreCase(su));
		
		String s3 ="  Hyderabad  ";
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		
		

	}

}
