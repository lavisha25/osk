class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapp = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            int find=target-nums[i];
            if(mapp.containsKey(find)){
                ans[0]=i;
                ans[1]=mapp.get(find);
                return ans;
            }
            else{
                mapp.put(nums[i],i);
            }
        }
        return ans;
    }
}
