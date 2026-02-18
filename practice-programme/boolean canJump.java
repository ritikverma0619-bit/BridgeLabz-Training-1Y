class Solution {
    public boolean canJump(int[] nums) {
       int j = 0;
       for(int i =0;i<nums.length;i++){
        if(i>j) return false;
        int c = nums[i];
        if(i+c>j){
            j= i+c;
        }
       }
       if(j>=nums.length-1){
        return true;
       }
       else{
        return false;
       }
    }

}