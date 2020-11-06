class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int[] ans=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n;k++)
            {
                if(i!=k)
                {
                    if(nums[i]+nums[k]==target)
                    {
                        ans[0]=i;
                        ans[1]=k;
                        break;
                    }
                }
                
            }
        }
        return ans;
    }
    
}
