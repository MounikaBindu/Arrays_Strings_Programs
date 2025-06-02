package logicalprogramms;

public class Swap_numbers {
//	public static void main(String[] args) {
//		int a=11;
//		int b=23;
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println(a+" "+b);
//	} //Normal swap
	
	public static void main(String[] args) {
		int a=23;
		int b=22;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}//swaping 2 numbers

}
