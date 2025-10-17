class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int [] res = new int [len];
        for (int i=0;i<len/2;i++){
            res[i*2] = nums[i];
            res[i*2+1] = nums[i+n];
        }
        return res;
    }
}