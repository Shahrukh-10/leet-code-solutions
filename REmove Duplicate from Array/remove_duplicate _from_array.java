class Solution 
{
     public int removeDuplicates(int[] nums) 
    {
      if (nums.length == 0) return 0;
      int i = 0;
      for (int j = 1; j < nums.length; j++) {
          if (nums[j] != nums[i]) {
              i++;
              nums[i] = nums[j];
          }
      }
      return i+1 ;
  }
  public static void main(String[] args)
  {
    int nums={1,2,3,5,5,5,5,5,5,7,7,8,8,8};
    System.out.print(removeDuplicates(nums) );
  }
}
//PARABOY
