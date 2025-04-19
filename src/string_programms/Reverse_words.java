package string_programms;

public class Reverse_words {
	public static void main(String[] args) {
		String s="this is mounika";
		System.out.println(reverse_words(s));
	}
	public static String reverse_words(String s) {
		String[] str=s.split(" ");
		String res="";
		for(String i:str) {
			StringBuilder str1=new StringBuilder();
			str1.append(i);
			str1.reverse();
			res=res+str1.toString()+" ";
			str1=new StringBuilder();
			
		}
		return res;
	}

}
