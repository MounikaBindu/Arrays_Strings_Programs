package array_programmms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_duplicates {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr.add(sc.nextInt());
		}
		System.out.println(remove_duplicates(arr));	
	}
	public static ArrayList<Integer> remove_duplicates(ArrayList<Integer> arr) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i:arr) {
			s.add(i);
		}
		for(int i:s) {
			a.add(i);
		}
		
	    
		return a;
		
	}

}
