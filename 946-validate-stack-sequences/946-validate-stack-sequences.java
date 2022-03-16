class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pop =0 ;
        for(int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
        while(stack.isEmpty() == false && popped[pop] == stack.peek()) {
            stack.pop();
            pop++;
        }
        
        }
        return stack.size() == 0;
    }
}