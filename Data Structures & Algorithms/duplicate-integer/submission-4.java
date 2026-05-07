// sorting 
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for ( int n=0;n<nums.length-1;n++){
            if(nums[n] == nums[n+1]){
                return true;
            }
        }
        return false;
    }
}