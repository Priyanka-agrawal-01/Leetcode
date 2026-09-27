class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++) {

            if(sb.charAt(i) == '(') {
                st.push(i);
            }

            else if(sb.charAt(i) == ')') {

                int start = st.pop();

                StringBuilder rev = new StringBuilder(
                    sb.substring(start + 1, i)
                );

                rev.reverse();

                sb.replace(start, i + 1, rev.toString());

                i = start - 1;
            }
        }
        return sb.toString();
    }
}