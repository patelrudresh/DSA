class Insertion
{
	public static void main (String [] args){
		int arr[]={2,12,31,1,4,9,8};
		for (int i=arr.length;i>0 ;i-- )
		{
			//System.out.print(arr[i]);
			for (int j=arr.length-1-i;j>=0 ;j-- )
			{ if(arr[j]>arr[j+1]){
				int temp =arr[j]; 
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}else
				break;
			}
		}
	
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}

/*
for (int i=1;i<arr.length ;i++ )
		{
			for (int j=i;j>0 ;j-- )
			{ if(arr[j]<arr[j-1]){
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}else
				break;
			}
		}
*/