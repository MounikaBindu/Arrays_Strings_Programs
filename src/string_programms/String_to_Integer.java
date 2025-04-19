package string_programms;

import java.util.Scanner;

public class String_to_Integer {

	public static int  String_toInteger(String s) {
		 int num = Integer.valueOf(s); 
	        return num;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(String_toInteger(s));
	}
}
