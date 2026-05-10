class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs){
            char[] chara=s.toCharArray();
            Arrays.sort(chara);
            String sorteds=new String(chara);
            res.putIfAbsent(sorteds,new ArrayList<>());
            res.get(sorteds).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
