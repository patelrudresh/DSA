
import java.util.Arrays;
public class Pairsum {
    public static int[] twoSumSorted(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
            
			  break;// Returning indices
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // If no pair found
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 8, 9}; // Sorted array
        int target = 10;
        int[] result = twoSumSorted(nums, target);
      //System.out.println(result.toString(result)); // Output: [2, 4] (3 + 6 = 10)
    }
}

