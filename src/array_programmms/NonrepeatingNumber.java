package array_programmms;

import java.util.ArrayList;


///array integers twice the numbers and only one uniquie number is present print that number 

public class NonrepeatingNumber {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4,4,7};
		System.out.println(nonRepeatingNumber(arr));
	}
	public static int nonRepeatingNumber(int arr[]) {
		int n=arr.length;
	    ArrayList<Integer> a=new ArrayList<>();
		int i=0;
		while(i<n) {
			if(!a.contains(arr[i])) {
				a.add(arr[i]);
				
			}else {
				a.remove(Integer.valueOf(arr[i]));
			}
			
			i++;
		}
		if(!a.isEmpty()) {
		return a.get(0);
		}
		return -1;
		
	}

}
