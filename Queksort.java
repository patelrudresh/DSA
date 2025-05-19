class Queksort
{ 
	
	public static void Quieksort(int arr[],int start, int end){
		if(start>=end){
		return;
	}
		int pivot=partition (arr, start,end);
		Quieksort(arr,start,pivot-1);
		Quieksort(arr,pivot+1,end);
	}
	static int partition(int arr[],int start,int end){
		// Use the last element as pivot
        int pos = start ;
		for(int i=start; i<=end;i++){
			if(arr[i]<=arr[end]){
				int temp=arr[i];
			    arr[i]=arr[pos];
				arr[pos]=temp;
			    pos++;
			} 
		}return pos-1;
	}
	public static void main(String [] args){
		int arr[]={3,5,7,8,4};
		int start=0;
		int end=arr.length -1;
		Quieksort(arr,start,end);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}