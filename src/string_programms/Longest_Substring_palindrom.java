//package string_programms;
//
//public class Longest_Substring_palindrom {
//	public static void main(String[] args) {
//		String s="forgeeksskeegfor";
//		int m=0;
//		String r="";
//		for(int i=0;i<s.length();i++) {
//			String ch=s.charAt(i)+"";
//			for(int j=i+1;j<s.length();j++) {
//				ch=ch+s.charAt(j);
//				if(isPalindrom(ch)) {
//					if(ch.length()>m) {
//						m=ch.length();
//						r=ch;
//						
//					}
//				}
//			}
//		}
//		System.out.println(r);
//	}
//	public static boolean isPalindrom(String ch) {
//		String res="";
//		for(int i=0;i<ch.length();i++) {
//			res=ch.charAt(i)+res;
//		}
//		if(res.equals(ch)) {
//			return true;
//		}
//		return false;
//		
//		
//		
//	}
//
//}



//this is optimized code



package string_programms;

public class Longest_Substring_palindrom {
    public static void main(String[] args) {
        String s = "forgeeksskeegformalayalam";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int max=0;
        String r="";
        for(int i=0;i<s.length();i++) {
        	String res="";
        	for(int j=i;j<s.length();j++) {
        		res+=s.charAt(j);
        		if(isPara(res)) {
        			if(res.length()>max) {
        				max=res.length();
        				r=res;
        			}
        		}
        		
        	}
        }
        return r;
    }
    
    public static boolean isPara(String s) {
    	int left=0;
    	int right=s.length()-1;
    	while(left<right) {
    		if(s.charAt(left)!=s.charAt(right)) {
    			return false;
    		}
    		left++;
    		right--;
    	}
    	return true;
    }
}

