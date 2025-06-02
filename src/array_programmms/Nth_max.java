package array_programmms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Nth_max {
	public static void main(String[] args) {
		int[] arr= {84,844,84,91,7};
		int n=5;
		int nth=findNthlargest(arr,n);
		if(nth!=Integer.MIN_VALUE) {
			System.out.println("largest "+n+" number is "+nth);
		}
		else {
			System.out.println("invalid");
		}
		
	}
	
//	public static int findNthlargest(int arr[],int n) {//selection sort
//		int len=arr.length;
//		if(n>len || n<=0) {
//			return Integer.MIN_VALUE;
//		}
//		
//		for(int i=0;i<len-1;i++) {
//			int mxin=i;
//			for(int j=i+1;j<len;j++) {
//				if(arr[j]>arr[mxin]) {
//					mxin=j;
//				}
//			}
//			int t=arr[i];
//			arr[i]=arr[mxin];
//			arr[mxin]=t;
//		}
//		for(int i=0;i<len;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		return arr[n-1];
//				
//	}
//	

	
	public static int  findNthlargest(int arr[],int n){
		 
	    Set<Integer> set=new TreeSet<>();
	    for(int i=0;i<arr.length;i++){
	        set.add(arr[i]);
	    }
	    List<Integer> li=new ArrayList<Integer>(set);
	    int k=li.size();
	    if(n>k || n<=0){
	        return Integer.MIN_VALUE;
	    }
	    return li.get(k-n);
	    
	    
	}

}
