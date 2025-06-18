package basics;

public class Sbmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//methd are syschronized
		//length(),capacity, CharAt()
		
		StringBuffer sb = new StringBuffer("Bhavana");
		System.out.println(sb.length()); //7
		System.out.println(sb.capacity()); //23
		System.out.println(sb.charAt(4)); //a
		sb.setCharAt(3, 'u');
		System.out.println(sb); //Bhauana
		
		System.out.println(sb.append(3.14)); //Bhauana3.14 //overloaded append with double type
		System.out.println(sb.delete(7, 10)); //Bhauana4
		System.err.println(sb.deleteCharAt(7));  //Bhauana
		System.out.println(sb.insert(7, " H N")); //Bhauana H N
		System.out.println(sb.reverse()); //N H anauahB
		
		//setlength(), ensureCapacity(), trimToSize()
		
		StringBuffer sb1 =new StringBuffer("AishwaryaAbhi");
		sb1.setLength(9);
		System.out.println(sb1);  //Aishwarya
		
		sb1.ensureCapacity(1000);
		System.out.println(sb1.capacity());  //1000
		
		sb1.trimToSize();
		System.out.println(sb.capacity()); //23  -- to improve the memory   (free memory will be deallocated)
		
		
	}

}
