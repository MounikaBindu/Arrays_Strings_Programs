package string_programms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="programming";
       String res=duplicateStr(s);
       System.out.println(res);
	}
	public static String duplicateStr(String s){
        char ch[]=s.toCharArray();
        String res="";
        Set<Character> set=new LinkedHashSet<Character>();
        for(char c:ch){
            set.add(c);
        }
        for(Character c:set){
            res+=c;
        }
        return res;
        
        
   }

}
