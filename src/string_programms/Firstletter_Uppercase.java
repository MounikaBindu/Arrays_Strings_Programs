package string_programms;

public class Firstletter_Uppercase {
	public static void main(String[] args) {
		String s="this is mounika bindu";
		String[] str=s.split(" ");
		String s2="";
		for(String s1:str) {
			s2=s2+(char)(s1.charAt(0)-32);
			for(int i=1;i<s1.length();i++) {
				s2=s2+s1.charAt(i);
			}
			s2=s2+" ";
		}
		System.out.println(s2);
		
		
	}

}
