package array_programmms;

import java.util.Scanner;

public class Fibinocii_reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n-2;i++) {
			int c=a+b;
			System.err.print(c+" ");
			a=b;
			b=c;
			
			
		}
	}

}
