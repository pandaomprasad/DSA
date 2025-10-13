class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int dig=0;
        for (int i=0;i<n;i++){
            dig = dig+nums[i];
            ans[i]= dig;
        }

        return ans;
    }
}