class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            boolean isAdded = set.add(nums[i]);

            if (!isAdded) {
                return true;
            }
        }
        return false;
    }
}