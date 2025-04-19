package array_programmms;

public class Sum_pair_equalto_target {
	public static boolean sumPair(int arr[],int tar) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]!=arr[j]) {
//					int m=arr[i]+arr[j];
//					
//					if(m==tar) {
//						return true;
//					}
//				}
//			}
//		}
//		return false;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			
			int carr=arr[left]+arr[right];
			if(carr==tar) {
				return true;
			}
			if(carr>tar) {
				right--;
			}else {
				left++;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 6, 8, 9, 14, 15};
		int target=13;
		if(sumPair(arr,target)) {
			System.out.println("Pair is present");
		}
		else {
			System.out.println("not present");
		}
	}

}
