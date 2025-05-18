class DuplicateElement 
{
	public static int Removeduplicate(int arr[]){
		 int i=0;
		 int j=1;
		   while(j<=arr.length-1)
		 {
			 if (arr[j]!=arr[i])
			 {
				  i++;
				 arr[i]=arr[j];
			 }j++;
		 } return i+1;
	
	
	
	}
		
	public static void main(String[] args) 
	{
		int arr[]={1,1,2,2,3,4,4};
		
		int  a=Removeduplicate(arr);
		 for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
		
		
	}
}

/*if (arr.length==0){ return 0; }
		{
		}
		int i=0;
		
		for (int j=1;j<arr.length ;j++ )
		{
			if(arr[j]!=arr[i]){
			
				i++;
					arr[i]=arr[j];
			}
			
		}
		return  i+1;
	}*/