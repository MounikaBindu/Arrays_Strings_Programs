package string_programms;

public class FirstNonReapeatingCharacter {
	public static void main(String[] args) {
		String s="dghdghidfifhfhfwhs";
		String  ch=firstNonReapeating(s);
		System.out.println(ch);//w
	}
	public static String firstNonReapeating(String s) {
		int n=s.length();
		for(int i=0;i<n;i++) {
			int c=1;
			for(int j=0;j<n;j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					c++;
					break;
				}
				
			}
			if(c==1) {
				return s.charAt(i)+"";
			}
		}
		return "no non-repeating characters";
		
	}

}
