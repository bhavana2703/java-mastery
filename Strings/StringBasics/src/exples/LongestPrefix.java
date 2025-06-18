package exples;

public class LongestPrefix {

	public static void main(String[] args) {
		
		
		String [] str = {"flower", "flow", "float", "flight"};
		
		String longest = LongestPre(str);
		
		System.out.println(longest);
		
	}
	public static String LongestPre(String[] strs)
	{
		if(strs == null || (strs.length==0)) return "";
		
		String prefix= strs[0];
		
		for(int i=1;i<strs.length;i++) {
			
			while(strs[i].indexOf(prefix)!=0)
			{
				prefix =prefix.substring(0, prefix.length() -1);
				
				if(prefix.isEmpty()) return"";
			}
		}
		
		return prefix;
		
		
	}

	

}
