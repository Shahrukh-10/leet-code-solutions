class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int k=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    k++;
                }
            }
            if(k<3)
            {
               c=nums[i];
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
      int[] arr={0,1,0,1,0,1,9};
      System.out.print(singleNumber(arr));
    }
}
