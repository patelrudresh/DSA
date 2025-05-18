class Removenumber 
{
	public static int removeel(int arr[],int val){
		
		int i=0;
		for (int j=0;j<=arr.length-1 ;j++ )
		{
			if (arr[j]!=val)
			{
				
				arr[i]=arr[j];
				i++;
				
			}
			
		} return i;
	}
	public static void main(String[] args) 
	{
		int []arr={1,5,6,7,4};
		int val=6;
		int  a=removeel(arr,val);
		for (int i=0;i<=a ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
