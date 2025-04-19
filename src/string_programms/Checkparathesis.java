package string_programms;

import java.util.Scanner;
import java.util.Stack;

public class Checkparathesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		StringBuilder str=new StringBuilder();
		str.append(string);
		if(isValid(str.toString())) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		for(char i:s.toCharArray()) {
			char c=i;
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) return false;
				char top=stack.pop();
				if(c==']' && top!='[' ||
				  c=='}' && top!='{'  ||
				  c==')' && top!='('
				  ) return false;
			}
		}
		return stack.isEmpty();
		
	}

}
