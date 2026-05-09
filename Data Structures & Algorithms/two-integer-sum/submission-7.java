class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> premap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int dif=target-num;
            if(premap.containsKey(dif)){
                return new int[]{premap.get(dif),i};
            }
            premap.put(num,i);
        }
        return new int[0];
    }
}
