class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target==0)
        {
            return 0;
        }
        else if(nums.length==1)
        {
            if(nums[0]==target)
            {
                return 0;
            }
        }
        else if(nums.length>1 )
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==target)
                {
                    System.out.print(i);
                    return i;
                }
                else if(i < nums.length-1)
                {
                    if(target > nums[i] && target < nums[i+1])
                    {
                        return i+1;
                    }
                    else if(target < nums[0])
                    {
                        return 0;
                    }
                }
               
            }
        }
        return nums.length;
    }
    public static void main (String[] args)
    {
      int val=6;
      int[] arr={1,2,4,6};
      System.out.print(searchInsert(arr,val);
    }
    
}
