package string_programms;

public class PalindromString {
	public  static boolean palindrom(String s) {
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s="Malayalam";
		if(!palindrom(s)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("Not a Palindrom");
		}
		
	}

}
