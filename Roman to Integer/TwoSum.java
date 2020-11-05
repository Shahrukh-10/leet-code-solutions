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
    public static void main(String[] args)
    {
      int[] nums={1,2,3,4,5,6};
      int target=11;
      System.out.print(twoSum(nums,target));
    }
    
    }
