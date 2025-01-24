public class LTcode006 {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        int k = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++; 
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
         int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums: " + java.util.Arrays.toString(nums1));
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums: " + java.util.Arrays.toString(nums2));
    }
}