package array_programmms;
import java.util.*;

public class Sorting_Array {
	public static void main(String[] args) {
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(20);
//		arr.add(1);
//		arr.add(7);
//		Collections.sort(arr);
//		System.out.println(arr);
		
		int arr[]= {2,1,9,6};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
