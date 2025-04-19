package string_programms;

import java.util.Scanner;

public class Max_reating_substring {
	 public static int maxRepeating(String seq, String word) {
	        int nseq=seq.length();
	        int nword=word.length();
	        int i=0;
	        int j=0;
	        int c=0;
	        while(i<nseq){
	            if(j<nword){
	                if(seq.charAt(i)==word.charAt(j)){
	                    i++;
	                    j++;
	                }
	            }
	            else{
	                j=0;
	                c++;
//	                i++;
	                System.out.println(c);
	            }
	        }
	        return c;
	        
	        
	    }
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String word=sc.next();
		System.out.println(maxRepeating(s,word));
	}

}
