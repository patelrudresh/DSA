import java.util.Scanner;
class Selection 
{
	public static void main(String [] args){
		
		int [] arr={10,5,3,9,8,2};
		 for (int i=0;i<arr.length-1 ;i++ )
		 {
			int  index=i;
				 for (int j=i+1;j<arr.length ;j++ )
				 {
					if(arr[j]<arr[index])
						j=index;
				 }
				 //swap
				 int temp=arr[index];
				 arr[index]=arr[i];
					 arr[i]=temp;
		 }
		for (int i=0;i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}