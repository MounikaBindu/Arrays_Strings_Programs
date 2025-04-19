package array_programmms;

public class LongestSubarrayLength {
	public static int findLength(int[] nums, int k){
		int left=0;
		int curr=0;
		int ans=0;
		for(int right=0;right<nums.length;right++) {
			curr+=nums[right];
			while (curr>k) {
				curr-=nums[left];
				left++;
			}
			ans=Math.max(ans, right-left+1);
			
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int[] arr={3, 1, 2, 7, 4, 2, 1, 1, 5};
		int k=8;
		System.out.println(findLength(arr,k));
		
	}
	
}
//Given an array of positive integers nums and an integer k, 
//find the length of the longest subarray whose sum is less than or equal to k. 
//This is the problem we have been talking about above. We will now formally solve it.

//o/p:4
//[4,2,1,1]
