public class MoveZero {

   public static void movezero(int arr[]){
	int i=0;
	for(int j=0;j<arr.length;j++){
		if(arr[j]!=0){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
		}
	}
   }

    public static void main(String[] args) {
       int arr[]={0,1,0,2,56,7};
	   movezero(arr);
	   for(int num : arr){
			System.out.println(num);
	   }
    }
}
