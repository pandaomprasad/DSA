class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 0;
        int i=0;
        for(int j=1;j<len;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
                count++;
            }
        }
        return count+1;
    }
}