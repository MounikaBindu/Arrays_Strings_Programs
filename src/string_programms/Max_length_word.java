package string_programms;

public class Max_length_word {
	public static void main(String[] args) {
		String s="mounika bindu maya";
		System.out.println(maxlengthword(s));
	}
   public static String maxlengthword(String s) {
	   String[] str=s.split(" ");
	   int max=0;
	   String s1="";
	   for(String i:str) {
		   if(i.length()>max) {
			   max=i.length();
			   s1=i;
			   
		   }
	   }
	   return s1;
	   
   }
}
