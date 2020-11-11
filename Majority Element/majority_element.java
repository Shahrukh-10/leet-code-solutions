class Solution {
    public int majorityElement(int[] nums) {
        int major=nums.length/2;
        int[] arr=new int[10];
        if(nums.length==1)
        {
            return nums[0];
        }
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
            if(k > major)
                {
                    return nums[i];
                }
        }
        return -1;
    }
    public static void main(String[] args)
    {
      int[] arr={1,1,1,1,1,1,2,5,8,6,3,1,1};
      System.out.print(majorityElement(arr));
    }
    
    
}
