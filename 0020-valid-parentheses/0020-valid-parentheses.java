class Solution {
    public boolean isValid(String s) {
        Stack<Character> t = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // opening
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
                t.push(s.charAt(i));
            }else{
                if (t.empty()) {
                return false;
                }
            //closing
                if (s.charAt(i)==')'&& t.peek()=='('||s.charAt(i)=='}'&& t.peek()=='{'||s.charAt(i)==']'&& t.peek()=='[') {
                    t.pop();
            
                }else{
                    return false;
                }
            }
        }
        //check
        if (t.empty()) {
            return true;
        }
        return false;
    }
}
