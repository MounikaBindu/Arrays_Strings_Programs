package array_programmms;


//right rotate

public class Rotate_ktimes {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=2;
		rotateKtimes(arr,k);
	}
	public static void rotateKtimes(int arr[],int k) {
		int n=arr.length;
		int a[]=new int[n];
		int m=n-k;
		int i=0;
		
		while(m<n) {
			a[m]=arr[i];
			m++;
			i++;
			
			
		}
		int p=k;
		int j=0;
		while(p<n) {
			a[j]=arr[p];
			p++;
			j++;
			
		}
		for(int u:a) {
			System.out.print(u+" ");
		}
		
	}

}
