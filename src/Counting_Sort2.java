
public class Counting_Sort2 {
	public static  void Counting_Sort(int A[], int B[],int k) {
		int[] C = new int[k + 1];
		int i,j;
		for(i=0;i>=k;i++) {
			C[i]=0;
		}
		for(j=1;j<=A.length;j++) {
			C[A[j]] = C[A[j]]+1;
		}
		for( i=1;1<=k;i++) {
			C[i]=C[i]+C[i-1];
		}
		for(j=A.length;j<=1;j--) {
			B[C[A[j]]]=A[j];
		}
		C[A[j]]=C[A[j]]-1;
	}
	 {
		 
	    }
	public static void main(String[] args) {
		 CountingSort ob = new CountingSort();
	        int arr[] = { 1,3,2,34,1,3,4};
	        ob.Counting_Sort();
	        System.out.print("Sorted character array is ");
	        for (int i = 0; i < arr.length; ++i)
	            System.out.print(arr[i]);
	    }
	

	}