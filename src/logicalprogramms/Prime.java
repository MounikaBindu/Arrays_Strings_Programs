package logicalprogramms;

public class Prime {
//	public static void main(String[] args) {
//		int n=20;
//		System.out.println(
//				new java.math.BigInteger(String.valueOf(n)).isProbablePrime(1)?"prime":"Not prime");
//	}
	
	public static void main(String[] args) {
		int n=2;
		boolean t=true;
		if(n<2) {
			t=false;
			
		}
		int c=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				c++;	
			}
		}
		if(c==1 || t) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
