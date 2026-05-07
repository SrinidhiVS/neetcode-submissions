class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int d=target-n;
            if(hp.containsKey(d)){
                return new int[]{hp.get(d),i};
            }
            hp.put(n,i);
        }
        return new int[]{};
    }
}
