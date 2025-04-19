package string_programms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Silding_Anagrams {
	public static void main(String[] args) {
		String s="forzdofrbjfrojfor";
		String n="for";
		System.out.println(sildingAnagrams(s,n));
	}
	public static int sildingAnagrams(String s,String n) {
		int k=n.length();
		char ch1[]=n.toCharArray();
		Arrays.sort(ch1);
		int c=0;
		for(int i=0;i<=s.length()-k;i++) {
			String window=s.substring(i,i+k);
			char ch2[]=window.toCharArray();
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2)) {
				c++;
			}
			
		}
		return c;
		
	}

}


//output:4
