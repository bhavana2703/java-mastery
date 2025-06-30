package exples;

public class ReverseWithoutChangeSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "r#$aa*q$Pid";
		char [] ch = str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			if(!Character.isAlphabetic(ch[i])) i++;
			else if(!Character.isAlphabetic(ch[j])) j--;
			else {
				char c = ch[i];
				ch[i] =ch[j];
				ch[j]=c;
				i++;
				j--;
			}
			
		}
		String res = new String(ch);
		System.out.println(res);

	}

}
