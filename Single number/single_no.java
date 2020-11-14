class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int g=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=0;
            for(int j=0;j<nums.length;j++)
            {
               
                    g=nums[i];
                    if(nums[i]==nums[j])
                    {
                        k++;      
                    }

            }
            if(k==1)
            {
                break;
            }
        }
        return g;
    }
    public static void main(String[] args)
    {
    int[] arr = {1,2,2,3,3};
    System.out.print(singleNumber(arr));
    }
}
