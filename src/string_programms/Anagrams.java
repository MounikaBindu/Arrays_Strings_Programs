package string_programms;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		String s="listen";
		String m="stenil";
		if(anagrams(s,m)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("not");
		}
	}
	
	public static boolean anagrams(String s,String m) {
		s=s.toLowerCase();
		m=m.toLowerCase();
		
		if(s.length()!=m.length()) {
			return false;
		}
		
		char ch1[]=s.toCharArray();
		char ch2[]=m.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<s.length();i++) {
			if(ch1[i]!=ch2[i]) {
				return false;
				
			}
			
		}
		return true;
	}

}
