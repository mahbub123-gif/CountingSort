
class CountingSort {
	
	public static  void Counting_Sort(int A[]) {
		int i,j,k=9;
		int B[]=new int [A.length];
		int C[]=new int[k];
		for(i=0;i<k;i++) {
			C[i]=0;
		}
		for(j=0;j<=A.length-1;j++) {
			C[A[j]-1] = C[A[j]-1]+1;
		}
		for(i=0;i<=C.length;i++) {
			System.out.println(C[i]);
		}
		/*for( i=0;1<=k-1;i++) {
			C[i]=C[i]+C[i-1];
		}
		for(j=A.length-1;j>=0;j--) {
			B[C[A[j]]]=A[j];
			C[A[j]]=C[A[j]]-1;
		}*/
		
	}
  
	
  
  public static void main(String args[]) {
      
	  int a[]= {1,9,3,8,4,2};
	  CountingSort A = new  CountingSort();
	  A.Counting_Sort(a);
      System.out.print("Sorted array is : ");
      for (int i = 0; i < a.length; i++)
          System.out.print(a[i]);
      
  }

  
}