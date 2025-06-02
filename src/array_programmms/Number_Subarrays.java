package array_programmms;


//Example 3: Subarray Product Less Than K.
//
//Given an array of positive integers nums and an integer k, return the number of subarrays where the product of all the elements in the subarray is strictly less than k.
//
//For example, given the input nums = [10, 5, 2, 6], k = 100, the answer is 8. The subarrays with products less than k are:
//
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
//


public class Number_Subarrays {
	public static  int subArray(int arr[],int k) {
		int c=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<k) {
//				c++;
//			}
//			int m=arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				m=m*arr[j];
//				if(m<k) {
//					c++;
//					
//				}
//			}
//		}
//		return c;
//above we get o(n^2)
		
		int left=0,p=1,count=0;
		if(k<=1) return 0;
		for(int right=0;right<arr.length;right++) {
			p*=arr[right];
			while(p>=k) {
				p/=arr[left];
				left++;
			}
			count+=right-left+1;
					
		}
		return count;
		
		
		
	}
	public static void main(String[] args) {
		int[] arr= {10,5,2,6};
		int k=100;
		System.out.println(subArray(arr,k));
	}

}
