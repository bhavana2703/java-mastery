package basics;

public class StrBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String : content is always fixed (due to imutablity)eg: college name, address..etc
		// StringBuffer : Content is keep on changing the go with SB(all changes is done through existing object only)

		String s = new String("Java");//length =4 and capacity=4
		
		StringBuffer sb = new StringBuffer(); //length is diff and capacity is diff

		//default capacity ==16
		//new capacity = (cc+1)*2 ==(16+1)*2 =34

		System.out.println(sb.capacity()); //16
		sb.append("abcdefghijklmnoplXjkl");
		System.out.println(sb.capacity()); //34
		
		//--Part 2
		
		StringBuffer sb1 = new StringBuffer(); //16
		
		StringBuffer sb2 = new StringBuffer(1000); //1000
		
		StringBuffer sb3 = new StringBuffer("Durga");
		System.out.println(sb3.capacity());// 16+5 = 21
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
