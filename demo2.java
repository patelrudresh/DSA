class demo2 {
	
	public static int helloSorted(int arr[]){
		int N=5;
		 int ave= N*(N+1)/2;
		 
		 int sum=0;
		 for (int i=0;i<=arr.length-1 ;i++ )
		 {
			 sum+=arr[i];
		 }
			 int index=ave-sum;
		return N;
	}
	public static void main(String args[]){
		int[] arr={1,2,5};
		
		
		int result= helloSorted(arr);
		  System.out.println(result);
		 
		/*for (int i=0;i<result ;i++ )
		  {
		  			   System.out.println(arr[i]);
		  	
		  } */
	}
}