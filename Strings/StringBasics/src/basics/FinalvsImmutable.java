package basics;

public class FinalvsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Final -->referance -- we cant reassign the refrence variable
		//immutablility --->object
		
		final StringBuffer sb= new StringBuffer("Java");
		sb.append(" developer");
		System.out.println(sb);
		
	//	sb =new StringBuffer("Sql");   //The final local variable sb cannot be assigned. It must be blank and not using a compound assignment

	//	Final variable
	// Immutable objects
	}

}
