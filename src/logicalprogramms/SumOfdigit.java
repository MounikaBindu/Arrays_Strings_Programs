package logicalprogramms;

public class SumOfdigit {
//	public static void main(String[] args) {
//		int n=123;
//		int sum=0;
//		while(n!=0) {
//			int re=n%10;
//			sum=sum+re;
//			n=n/10;
//		}
//		System.out.println(((sum&1)==0)?"even":"Odd");
//	}
	
	public static void main(String[] args) {
		int n=2322,sum=0;
		for(;n>0;sum+=n%10,n/=10);
		System.out.println((sum&1)==0?"even":"Odd");
	}

}
