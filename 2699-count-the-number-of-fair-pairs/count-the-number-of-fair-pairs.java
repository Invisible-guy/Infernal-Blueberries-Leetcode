class Solution {
    public long find(int[] nums,int limit){
        int left = 0 ,right = nums.length-1;
        long res = 0;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum<=limit){
                res+=(right-left);
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        Arrays.sort(nums);
        return find(nums,upper)-find(nums,lower-1);
    }
}