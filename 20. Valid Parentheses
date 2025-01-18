
class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '{' || ch == '(' || ch == '[') {
                sk.push(ch);
            } else {
                if (sk.isEmpty()) {
                    return false;
                }
                
                char top = sk.peek();
                
                if (ch == '}' && top == '{') {
                    sk.pop();
                } else if (ch == ')' && top == '(') {
                    sk.pop();
                } else if (ch == ']' && top == '[') {
                    sk.pop();
                } else {
                    return false;
                }
            }
        }
        
        return sk.isEmpty();
    }
}
