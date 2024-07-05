class Solution {
    public int removeDuplicates(int[] nums) {
        int num = nums[0], count = 1,index = 1;
        for(int i=1;i<nums.length;i++){
            if(num == nums[i] && count < 2){
                count++;
                nums[index] = nums[i];
                index++;
            }
            else if(num != nums[i]){
                count = 1;
                nums[index] = nums[i];
                index++;
                num = nums[i];
            }
            
        }
        return index;
    }
}