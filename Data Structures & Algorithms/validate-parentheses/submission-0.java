class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        java.util.Map<Character,Character> ctp=new java.util.HashMap<>();
        ctp.put(')','(');
        ctp.put(']','[');
        ctp.put('}','{');

        for(char c : s.toCharArray()){
            if(ctp.containsKey(c)){
                if(!st.isEmpty() && st.peek()==ctp.get(c)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
