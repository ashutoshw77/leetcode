class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr = new int [2];
        HashMap<Integer,Integer>  map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(i!=0 && map.containsKey(target-nums[i])) {
                arr[0]= i;
                arr[1]=map.get(target-nums[i]);
                break;
            }
              map.put(nums[i],i);
        
        
        
     
    }
          return arr;
    }
}