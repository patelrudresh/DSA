import java.util.*;
class InterSection{
	
 public static List<Integer> findIntersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
		
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {  // nums1[i] == nums2[j]
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result=nums1[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 5};
        int[] nums2 = {2, 2, 3, 5, 6};
        System.out.println(findIntersection(nums1, nums2));  // Output: [2, 3, 5]
    }
}
