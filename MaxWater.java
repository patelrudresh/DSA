class Maxwater 
{
	public static int maxarea(int []arr){
		int maxwaters=0;
		int left=0;
		int right=arr.length-1;
		while(left< right){
			int currentwater=Math.min(arr[left],arr[right])*(right-left);
			maxwaters=Math.max(maxwaters,currentwater);
			
			if(arr[left]<arr[right]){
				left++;
			}else{
				right--;
			}
		}return maxwaters;
	}
	public static void main(String[] args) {
		int [] arr= {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxarea(arr));
	}
}
