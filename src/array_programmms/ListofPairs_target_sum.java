package array_programmms;

import java.util.ArrayList;
import java.util.List;

public class ListofPairs_target_sum {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9,10};
		int tar=12;
		List<int[]> li=pairsSum(arr,tar);
		for(int[] i:li) {
			System.out.println(i[0] +" "+i[1]);
		}
	    
	}
	public static List<int[]> pairsSum(int arr[],int tar){
		List<int[]> li=new ArrayList<int[]>();
		int right=arr.length-1;
		int left=0;
		
		while(left<right) {
			int sum=arr[left]+arr[right];
			if(sum==tar) {
				li.add(new int[] {arr[left],arr[right]});
				left++;
				right--;
				
			}
			else if(sum>tar) {
				right--;
			}else {
				left++;
			}
		}
		return li;
	}

}
