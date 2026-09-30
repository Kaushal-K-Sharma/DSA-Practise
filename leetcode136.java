class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        int n = nums.length;
// two same numbers gives XOR = 0; a^a = 0; and a^0 = a
        for(int i=0; i<n; i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }
}