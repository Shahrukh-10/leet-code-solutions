class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        if(nums.length==0)
        {
            return 0;
        }
        int n=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i]==1)
            {
                k++;
            }
            if(nums[i]!=1)
            {
                k=0;
            }
            if(k>n)
            {
                n=k;
            }
            
        }
        return n;
    }
    public static void main(String[] args)
    System.out.print(findMaxConsecutiveOnes({1,1,1,0,1,1});
}
