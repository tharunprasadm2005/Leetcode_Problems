// Last updated: 03/09/2025, 10:09:39
class Solution {
    public boolean isValid(String s) {
         Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;

    return stack.isEmpty();
    }
}