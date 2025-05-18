class Palandrama 
{
	public static boolean palindram(String str){
		
		int left=0;
		int right=str.length()-1;
		while(left<right){
			if(str.charAt(left)!= str.charAt(right)){
				return false;
			}
			left++;
			right--;
			
		} return true;
	}
	public static void main(String[] args) 
	{
		
		
		
		System.out.println(palindram("mom"));
	}
}
	/*	int left=0;
		int right=s.length()-1;
		
		while(left<right){
			if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
				return false;
			} left++;
            right--;
		}return true; */