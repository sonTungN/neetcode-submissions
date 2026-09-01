class Solution {
    public boolean hasDuplicate(int[] nums) {
        int MAX = (int) 1e5;
        int[] count = new int[MAX + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            if (count[nums[i]] > 1) {
                return true;
            }
        }

        return false;
    }
}