class Solution {
    public boolean check(int[] nums) {
        int n =nums.length;
        int drop = 0;
        for (int i=0;i<n;i++){
            if(i<n-1&&nums[i]>nums[i+1]){
                drop++;
            }
            else if(i==n-1&&nums[n-1]>nums[0]){
                drop++;
            }
        }

        return (drop>1) ? false:true;
    }
}