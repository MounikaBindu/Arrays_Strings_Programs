package string_programms;

import java.util.Scanner;

public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="mounia bugu gf";
		System.out.println(reverseString(s));
	}
	//this is mounika bindu
	public static String reverseString(String s) {
		s=s.trim();
		String res="";
		String s1[]=s.split("\\s+");
		for(int i=s1.length-1;i>=0;i--) {
			res=res+s1[i]+" ";
			
			
			
			
		}
		return res;
		
	}

}
