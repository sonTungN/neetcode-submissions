class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.get(num) == null) {
                freq.put(num, 0);
            }

            freq.put(num, freq.get(num) + 1);
        }

        int[] numArr = new int[freq.keySet().size()];
        int[] freqArr = new int[freq.keySet().size()];

        int index = 0;
        for (Integer key : freq.keySet()) {
            numArr[index] = key;
            freqArr[index] = freq.get(key);

            index++;
        }

        for (int i = 0; i < numArr.length - 1; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (freqArr[i] < freqArr[j]) {
                    int tmp = freqArr[i];
                    freqArr[i] = freqArr[j];
                    freqArr[j] = tmp;

                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }

        int[] outcome = new int[k];
        for (int i = 0; i < k; i++) {
            outcome[i] = numArr[i];
        }

        return outcome;
    }
}
