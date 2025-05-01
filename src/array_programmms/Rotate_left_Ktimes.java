package array_programmms;

public class Rotate_left_Ktimes {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int k=5;
		rotateLeft(arr,k);
	}
	public static void rotateLeft(int arr[],int k) {
		int n=arr.length;
		int a[]=new int[n];
		int m=n-k;
		int i=0;
		while(m<n) {
			a[i]=arr[m];
			m++;
			i++;
		}
		int p=k;
		int j=0;
		while(p<n) {
			a[p]=arr[j];
			j++;
			p++;
			
			
		}
		for(int o:a) {
			System.out.print(o+" ");
		}
	}

}
