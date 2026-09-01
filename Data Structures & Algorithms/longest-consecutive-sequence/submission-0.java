class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> store = new HashSet<>();

        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int max = 0, curr = num;
            while (store.contains(curr)) {
                max++;
                curr++;
            }

            result = Math.max(max, result);
        }
        return result;
    }
}
