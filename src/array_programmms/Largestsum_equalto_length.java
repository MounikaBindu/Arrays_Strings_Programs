package array_programmms;

public class Largestsum_equalto_length {
	public static void main(String[] args) {
		int arr[]= {3,-1,4,12,-8,5,6};
		int k=4;
		System.out.println(largestSum(arr,k));	
	}
	public static int largestSum(int arr[],int k) {
		int left=0;
		int sum=0;
		int c=0;
		int mx=Integer.MIN_VALUE;
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			c++;
			if(c==k) {
				c=0;
				if(sum>mx) {
					mx=sum;
					sum-=arr[left];
					left++;
				}
				
			}
			
			
		}
		return mx;
	}

}
