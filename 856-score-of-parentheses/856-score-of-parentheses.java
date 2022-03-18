class Solution {
    public int scoreOfParentheses(String s) {
        int result = 0 ;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i< s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(result);
                result = 0;
            }
            else result = stack.pop() + Math.max(2*result, 1);
            
        }
        return result;
    }
}