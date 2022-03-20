class Solution {
    public int longestValidParentheses(String s) {
          int n = s.length();
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '(') {
        stack.push((i));
      } else if (stack.isEmpty()) {
        stack.push(i);
      } else if (s.charAt(stack.peek()) == '(')
        stack.pop();
      else
        stack.push(i);

    }
  /*  System.out.println(stack.toString()); */
    if (stack.isEmpty())
      return n;
    int right = n;
    int left = 0;
    int result = 0;
    while (!stack.isEmpty()) {
      left = stack.pop();

      result = Math.max(right - left - 1, result);
      right = left;
    }
        result = Math.max(left, result);
    return result;
    }
}