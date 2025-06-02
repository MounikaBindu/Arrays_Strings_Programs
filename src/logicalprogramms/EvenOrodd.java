package logicalprogramms;

public class EvenOrodd {
//	public static void main(String[] args) {
//		int n=24;
//		String[] res= {"even","odd"};
//		System.out.println(res[n&1]);
//	}
	
	
	public static void main(String[] args) {
		int n=873;
		String s=((n&1)==0)?"Even":"Odd";
		System.out.println(s);
	}
	

}
// finding the even or odd without using if-else or loops

