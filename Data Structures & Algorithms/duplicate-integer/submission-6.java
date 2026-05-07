// Hashset length comparision
class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count()<nums.length;
    }
}