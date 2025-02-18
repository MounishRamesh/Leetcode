class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int first = st.pop();
                int second = st.pop();

                int ans = 0;
                if (token.equals("+")) {
                    ans = second + first;
                } else if (token.equals("-")) {
                    ans = second - first;
                } else if (token.equals("*")) {
                    ans = second * first;
                } else if (token.equals("/")) {
                    ans = second / first;
                }
                st.push(ans);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}