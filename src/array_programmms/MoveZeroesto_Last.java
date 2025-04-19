package array_programmms;

public class MoveZeroesto_Last {
	public static void main(String[] args) {
		   int[] arr={88,8,0,0,0,80,7,-1};
		   int[] arr1=moveZeroes(arr);
		   for(int i:arr1){
		       System.out.print(i+" ");
		   }
		}
		public static int[] moveZeroes(int[] arr){
		    int n=arr.length;
		    int[] arr1=new int[n];
		    int l=0;
		    int right=n-1;
		    int left=0;
		    while(l<n){
		        if(arr[l]!=0){
		            arr1[left]=arr[l];
		            left++;
		        }
		        else{
		            arr1[right]=arr[l];
		            right--;
		            
		        }
		        l++;
		        
		    }
		    return arr1;
		}

}
