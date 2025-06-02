package logicalprogramms;

public class GCD {
	public static void main(String[] args) {
		int a=36,b=60;
	    while((a%=b)!=0 && (b%=a)!=0);
	    System.out.println(a+b);
	}

}
