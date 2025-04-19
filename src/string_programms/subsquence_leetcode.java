package string_programms;

public class subsquence_leetcode {
	public static void main(String[] args) {
		String s="ace";
		String t="abcde";
		if(subSqu(s,t)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static boolean subSqu(String s,String t) {
		int i=0;
		int j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i==s.length();
	}

}
