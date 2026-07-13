class Solution {
    public boolean check(int[] nums) {
        int dip=0;
        if(nums[nums.length-1] > nums[0])
        dip++;
            
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                dip++;
            }
            if(dip >= 2)
            {
                return false;
            }
            

        }
        return true;
    }
}