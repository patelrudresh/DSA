import java.util.Arrays;
class HasTwoapairDiff 
{
	public static boolean HaspairDiff(int arr[],int diff){
		 Arrays.sort(arr);
		 
		 int i=0,j=0;
		while(j<arr.length){
			int current=arr[j]-arr[i];
			if(current==diff){
				return true;
			}else if(current<diff){
				j++;
				
			}else{
				i++;
			}
			
		}
		return false;
	} 
	
	public static void main(String[] args) 
	{
		
		int arr[]={1,5,9,12};
		int diff=4;
		boolean result =HaspairDiff(arr,diff);
		System.out.println(result);
	}
}
