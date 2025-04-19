package array_programmms;

public class Occurence {
	public static void main(String[] args) {
		int[] arr= {3,3,4,4,3,1};
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr1[i]==0) {
				int c=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
					arr1[j]=-1;
				}
			}
			System.out.println(arr[i]+"---"+c);
			
		}	
			
			
		}
	}

}
