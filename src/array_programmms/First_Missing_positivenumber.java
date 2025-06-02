package array_programmms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class First_Missing_positivenumber {

	public static void main(String[] args) {
		int[] arr= {0, 2, 2, 1, 1};
		System.out.println(firstMissingInteger(arr));
	}
//	public static int  firstMissingInteger(int[] arr) {
//		Arrays.sort(arr);
//		int n=arr.length;
//		int i=0;
//		int j=1;
//		while(i<n) {
//			if(arr[i]>0) {
//				if(arr[i]!=j) {
//					return j;
//					
//				}
//				else {
//					j++;
//				}
//			}
//			i++;
//		}
//		return j;
//		
//	}
	
	
//	public static int firstMissingInteger(int[] arr) {
//		int n=arr.length;
//		HashSet<Integer> s=new HashSet<Integer>();
//		for(int i:arr) {
//			if(i>0 && i<=n) {
//				s.add(i);
//			}
//		}
//		for(int j=1;j<=n;j++) {
//			if(!s.contains(j)) {
//				return j;
//				
//			}
//			
//		}
//		return n+1;
//		
//	}
	
	
	public static int firstMissingInteger(int[] arr) {
		Set<Integer> set=new LinkedHashSet<Integer>();
		int n=arr.length;
		for(int i:arr) {
			if(i>0 && i<=n) {
				set.add(i);
			}
		}
		for(int i=1;i<=n;i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return n+1;
	}
}

// above  code is not possible for 
//arr = {0, 2, 2, 1, 1}








