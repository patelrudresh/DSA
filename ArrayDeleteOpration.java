package Arrays;

public class ArrayDeleteOpration {
	public static void main(String[] args) {
		int[] arr = { 10, 12, 13, 45, 78 };
		int n = arr.length;
	//	int num = 13;
		
//delete from last
	
//        for (int i = 0; i < n; i++) {
//           // System.out.print(arr[i] + " ");
//	}
        // Reduce the array size by 1
        n--;
		
		
		
// delete from knth position
//		int index=0;;
//		 for (int i = 0; i < n; i++) {
//			 if(arr[i]!=num) {
//				 arr[index++]=arr[i];
//			 }
//		 }
//for (int j = 0; j <n ; j++) {
//		System.out.println(arr[j]);
//	}

//other appraoch
//		 boolean found=false;
//		 for (int i = 0; i < n; i++) {
//	          if (arr[i]==num) {
//	                arr[i - 1] = arr[i];
//	            }
//	           else if (arr[i] == num) {
//	                found = true;
//	            }
//	        }
//		 if (found == true)
//	            n--;
//	        
// --------------------------------------------------
// delete from first
//    	for(int i=1; i<=n-1;i++) {
//    		arr[i-1]=arr[i];
//    		n--;
//    		}

		for (int j = 0; j < n; j++) {
			System.out.println(arr[j]);
		}

	}
}
