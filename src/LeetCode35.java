public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int target = 5;
        int[] nums = {1, 3, 4, 5};
        LeetCode35 obj = new LeetCode35();
        System.out.println(obj.searchInsert(nums, target));
    }
}
