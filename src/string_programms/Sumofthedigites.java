package string_programms;

public class Sumofthedigites {
	public static void main(String[] args) {
		String s="mounika123h";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				sum=sum+(s.charAt(i)-48);
				
				
			}
		}
		System.out.println(sum);
	}

}
