class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int dif=target-n;
            if(map.containsKey(dif)){
                return new int[]{map.get(dif),i};
            }
            map.put(n,i);
        }
        return new int[0];
    }
}
