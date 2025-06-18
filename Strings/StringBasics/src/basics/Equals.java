package basics;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="keshava";  //--scp (1 obj)
		String b ="keshava";
		
		 System.out.println(a==b);         //true
		 System.out.println(a.equals(b));  //true
		
		
		 String s1 = new String("Bhavana");  //--scp,heap (2 obj) (reuse of the objects)
		 String s2 = new String("Bhavana");
		 
		 System.out.println(s1==s2);         //	 false
		 System.out.println(s1.equals(s2));  //  true
		 
		 StringBuffer sb1 =new StringBuffer("Pooja");
		 StringBuffer sb2 =new StringBuffer("Pooja");
		 //.equals() StringBuffer has not overeiden equals mtd

		 System.out.println(sb1==sb2);        // false
		 System.out.println(sb1.equals(sb2)); // false
		 
		 StringBuilder c =new StringBuilder("Pooja");
		 StringBuilder d =new StringBuilder("Pooja");
		 
		 System.out.println(c==d);        // false
		 System.out.println(c.equals(d)); // false
		 
	}

}
