class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            else{
                if(stack.isEmpty())
                    return false;
                Character pop = stack.pop();
             if(s.charAt(i) == ')') {
                if(pop != '(')
                    return false;
            }
                else if(s.charAt(i) == '}')
                {if(pop != '{')
                    return false;
                 }
                else if(pop != '[')
                    return false;
        }
    }
        return stack.isEmpty();
}
}