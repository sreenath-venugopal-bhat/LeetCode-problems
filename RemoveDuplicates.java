class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int current=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=current){
                count++;
                nums[++i]=nums[j];
                current=nums[j];
            }
        }
        return count;
    }
}