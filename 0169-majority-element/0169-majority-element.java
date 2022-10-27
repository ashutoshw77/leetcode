class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int prev =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=prev){
                if(c>nums.length/2) {
                    return prev;
                }                  
                c=0;
                prev=nums[i];
            }
            c++;
        }
        return nums[nums.length-1];
    }
}