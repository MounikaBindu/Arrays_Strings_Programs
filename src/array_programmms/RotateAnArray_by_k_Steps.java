package array_programmms;

public class RotateAnArray_by_k_Steps {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int k=4;
		rotate(arr,k);
		for(int i:arr) {
		System.out.print(i+" ");
		}
		
		
	}
	public static void rotate(int[] arr,int k) {
		int n=arr.length;
		int m=n-k;
		int j=0;
		int[] arr1=new int[n];
		for(int i=m;i<n;i++) {
			arr1[j]=arr[i];
			j++;
		}
		for(int i=0;i<m;i++) {
			arr1[k]=arr[i];
			k++;
			
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr1[i];
		}
		

		
		
	}
	

}
