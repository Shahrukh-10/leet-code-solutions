class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    if(j-i<=k)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,5,1};
        int k=6;
        System.out.print(arr,k);
    }
}
