class Solution {
   public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
  public static void main(String[] args)
  {
    int[] nums={1,2,6,6,6,7,9,4,6};
    int val=6;
    System.out.print(removeElement(nums,val);
  }
}
