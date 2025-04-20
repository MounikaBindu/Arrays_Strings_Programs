package string_programms;

public class Compressstring {
	public static void main(String[] args) {
		String s="aaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbhhhh";
		System.out.println(compressString(s));
	}
	public static String compressString(String s) {
		int n=s.length();
		String res="";
		int i=0;
		while(i<n) {
			int c=1;
			int j=i+1;
			char ch=s.charAt(i);
			while(j<n && ch==s.charAt(j)) {
				c++;
				j++;
			}
			i=j;
			res=res+ch+String.valueOf(c);
		}
		return res;
	}
	

}
