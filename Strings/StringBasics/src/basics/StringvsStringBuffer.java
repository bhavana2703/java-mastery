package basics;

public class StringvsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String s = new String("Bhavana"); //---heap(scp)
		  s.concat("H N");
		  System.out.println(s);
		  
		  StringBuffer sb =new StringBuffer("Bhavana");
		  sb.append("H N");
		  System.out.println(sb);

		
	}

}
