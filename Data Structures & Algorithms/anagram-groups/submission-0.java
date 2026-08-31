class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> output = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (output.get(sorted) == null) {
                output.put(sorted, new ArrayList<>());
            }

            output.get(sorted).add(s);
        }

        return new ArrayList<>(output.values());
    }
}
