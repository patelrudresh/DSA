
class Bubble
{
	public static void main(String [] args ){
		int arr[]={3,5,7,1,8};
		 System.out.println();
		for (int i=arr.length-1;i>=0 ;i-- )
		{
			for (int j=arr.length-1;j>=1 ;j-- )
			{ if (arr[j]>arr[j-1])
			{
				int temp= arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
			}
		}
          
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}/*
boolean swap;
		 for (int i=0;i<arr.length-1 ;i++ )
		 { swap=false;
			 for (int j=0;j<arr.length-1-i ;j++ )
			 {
				 if (arr[j]>arr[j+1])
				 {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 swap=true;
				 }
			 }
			 if (!swap)
			 {
				 break;
			 }
		 }*/