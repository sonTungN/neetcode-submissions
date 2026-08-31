public class Solution {
    public static void main(String[] args) {}

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.get(num) == null) {
                freq.put(num, 0);
            }

            freq.put(num, freq.get(num) + 1);
        }

        List<Integer>[] buckets = new List[nums.length];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        for (var entry : freq.entrySet()) {
            buckets[entry.getValue() - 1].add(entry.getKey());
        }

        int indexArray = nums.length - 1;
        int counter = 0;
        int[] result = new int[k];

        while (counter < k) {
            List<Integer> list = buckets[indexArray];
            for (int i = 0; i < list.size(); i++) {
                if (counter < k) {
                    result[counter] = list.get(i);
                    counter++;
                } else {
                    break;
                }
            }

            indexArray--;
        }

        return result;
    }
}
