class Solution {
    public void moveZeroes(int[] nums) {
        
        int n= 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[n]=nums[i];
                n++;
            }
        }
        for(int i=n;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args)
    {
       int[] nums={1,0,1,0,2,3};
       Solution obj = new Solution();
       obj. moveZeroes(nums);
    }
}
