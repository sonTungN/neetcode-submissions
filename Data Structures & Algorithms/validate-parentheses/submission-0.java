class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }

            if (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}') {
                if (isMatch(stack.peek(), s.charAt(i))) {
                    stack.pop();
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }

    private boolean isMatch(Character a, Character b) {
        if (a == '[' && b == ']') {
            return true;
        }

        if (a == '{' && b == '}') {
            return true;
        }

        if (a == '(' && b == ')') {
            return true;
        }

        return false;
    }
}
