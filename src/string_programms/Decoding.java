package string_programms;

import java.util.Scanner;
import java.util.Stack;

public class Decoding {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(decodingString(s));
		
	}
	public static String decodingString(String s) {
		Stack<Integer> stackNum=new Stack<>();
		Stack<StringBuilder> stackStr=new Stack<StringBuilder>();
		StringBuilder currentStr=new StringBuilder();
		int currentnum=0;
		
		char ch[]=s.toCharArray();
		for(Character c:ch) {
			if(Character.isDigit(c)) {
				currentnum=currentnum*10+c-'0';
			}
			else if(c=='[') {
				stackNum.push(currentnum);
				stackStr.push(currentStr);
				currentStr=new StringBuilder();
				currentnum=0;
				
			}
			else if(c==']') {
				StringBuilder prevstr=stackStr.pop();
				StringBuilder temp=new StringBuilder();
				int num=stackNum.pop();
				for(int i=0;i<num;i++) {
					temp.append(currentStr);
				}
				currentStr=prevstr.append(temp);
			}	
			else {	
				currentStr.append(c);
				}
			}
		return currentStr.toString();
		}
		
//i/p:	
//3[a2[c]]
	
//o/p:
//accaccacc
	
	

}
