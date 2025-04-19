package array_programmms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combine_two_Array_InSorted {
	public static void main(String[] args) {
		int arr1[]={2,3,7,9,10,11,87};
		int arr2[]= {3,1,10,22};
		 Arrays.sort(arr1);
	     Arrays.sort(arr2);
		List<Integer> lit=combine(arr1,arr2);
		System.out.println(lit);
	}
	public static List<Integer> combine(int arr1[],int arr2[]){
		List<Integer> li=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				li.add(arr1[i]);
				i++;
			}
			else {
				li.add(arr2[j]);
				j++;
			}
		}
		
		while (i < arr1.length) {
            li.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            li.add(arr2[j]);
            j++;
        }

        return li;		
	
		
	}

}
