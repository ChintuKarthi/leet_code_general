// Question: https://leetcode.com/problems/valid-parentheses/

public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(ch == '(' || ch == '[' || ch == '{' ) {
            stack.push(s.charAt(i));
        }
        else if( !stack.empty() && (((ch == ']') && stack.peek() == '[') || ((ch == ')') && stack.peek() == '(') || ((ch == '}') && stack.peek() == '{'))){
            stack.pop();
        }
        else {
            stack.push(s.charAt(i));
        }

    }
    if(stack.empty()){
        return true;
    }
    else {
        return false;
    }
}
