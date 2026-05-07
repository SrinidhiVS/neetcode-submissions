class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int diff=target-num;
            if(hp.containsKey(diff)){
                return new int[] {hp.get(diff),i};
            }
            hp.put(num,i);
        }
        return new int[] {};
    }
}
