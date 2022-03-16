class Solution {
    public String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
    Stack<String> stack = new Stack<String>();
    String[] components = path.split("/");
    for (String str : components) {

      if (str.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else if (!str.equals(".") && !str.equals("..") && !str.equals("")) {
        stack.push(str);
      }
    }

    if (stack.isEmpty())
      return "/";
    while (!stack.isEmpty()) {
      result.insert(0, stack.pop()).insert(0, "/");
    }
    return result.toString();
    }
}