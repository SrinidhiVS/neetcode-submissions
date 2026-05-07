class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        java.util.Map<Character,Character> mp=new java.util.HashMap<>();
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');

        for(char c:s.toCharArray()){
            if(mp.containsKey(c)){
                if(!st.isEmpty() && st.peek()==mp.get(c)){
                    st.pop();
                }
                else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
