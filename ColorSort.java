class ColorSort 
{	
	public static void sortColors(int []arr){
		int low=0;
		int mid=0;
		int high=arr.length-1;
	    
		while(mid<=high){
			if(arr[mid]==0){
				swap(arr,mid,low);
				mid++;
				low++;
			}else if(arr[mid]==1){
				mid++;
			}
			else{
				swap(arr,high,mid);
				high--;
			}
		}
	}
	
	private static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) 
	{
		int [] arr={2,0,1,2,0,1,0,1,2,1,2};
		
		sortColors(arr);
		for(int num :arr){
			System.out.println(num);
		}
	}
}
