class Solution {
    public String removeDuplicates(String st) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        s.push(st.charAt(0));
        for(int i=1;i<st.length();i++){
            if(!s.empty() &&s.peek()==st.charAt(i)){
                s.pop();
            }
            else{
                s.push(st.charAt(i));
            }
        }
        while(!s.empty()){
            sb.append(s.pop());
        }
        return sb.reverse().toString();
    }
}