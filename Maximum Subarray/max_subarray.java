class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length; 
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
        if(nums[i-1]>0){
        nums[i]+=nums[i-1];
        }
        sum=Math.max(nums[i],sum);
        }
        return sum;
}4,-6-
public static void main(String[] args)
{
  int[] nums={1,2,5,-4,-6,-3};
  System.out.print(maxSubArray(nums));
}
}
