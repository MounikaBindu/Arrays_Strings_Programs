package string_programms;

public class Remove_duplicates {
   public static void main(String[] args) {
	String s="programming";
	String res=removeDuplicates(s);
	System.out.println(res);//rgm
}
   public static String removeDuplicates(String s) {
	   String r="";
	   String result="";
	   int n=s.length();
	   for(int i=0;i<s.length();i++) {
		   int c=0;
		   for(int j=i+1;j<s.length();j++) {
			   if(result.indexOf(s.charAt(i))==-1){
				   result+=s.charAt(i);
			   }
			   
			   
		   }
		   
		
	   }
	   return result;
			   
   }

}
