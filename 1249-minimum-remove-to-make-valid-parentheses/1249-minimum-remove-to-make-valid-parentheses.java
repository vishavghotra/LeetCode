class Solution {
    public String minRemoveToMakeValid(String s) {
    StringBuilder result = new StringBuilder();
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.add(i);
        result.append(s.charAt(i));
      } else if (s.charAt(i) == ')') {
        if (stack.isEmpty() || s.charAt(stack.peek()) != '(')
          result.append('*');
        else {
          result.append(s.charAt(i));
          stack.pop();
        }
      } else if (s.charAt(i) == ']') {
        if (stack.isEmpty() || s.charAt(stack.peek()) != '[')
          continue;
        else {
          result.append(s.charAt(i));
          stack.pop();
        }
      } else if (s.charAt(i) == '}') {
        if (stack.isEmpty() || s.charAt(stack.peek()) != '{')
          continue;
        else {
          result.append(s.charAt(i));
          stack.pop();
        }
      } else
        result.append(s.charAt(i));

    }

    while (!stack.isEmpty()) {
      result.setCharAt(stack.pop(), '*');
    }
    return result.toString().replaceAll("\\*", "");

  }
}