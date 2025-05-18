import java.util.Arrays;
class Demo1
{
	public static int[] mergeSortedArrays(int arr1[],int arr2[]){
		int i=0; int j=0,k=0;
		int n=arr1.length,m=arr2.length;
		int [] result=new int[n+m];
		
		while(i<n && j<m){
			if (arr1[i]<arr2[j])
			{
				result[k++]=arr1[i++];
			}
			else{
				result[k++]=arr2[j++];
			}
		}
		
		while(i<n ){
			result[k++]=arr1[i++];
		}
		while(j<m){
			result[k++]=arr2[j++];
		}
		return result;
	} 
	
	public static void main (String [] args ){
		
		int [] arr1={1,3,4,8};
		int [] arr2={2,5,6,7};
		int[] a=mergeSortedArrays(arr1,arr2);
		System.out.println(Arrays.toString(a));
	}
}