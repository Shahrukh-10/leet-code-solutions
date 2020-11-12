public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length ==0){
            return null;
        }
        return getTreeNode(nums, 0, nums.length-1);
    }
    
     TreeNode getTreeNode(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int middle = start + (end-start)/2;
        TreeNode n = new TreeNode(nums[middle]);
        n.left = getTreeNode(nums, start, middle-1);
        n.right = getTreeNode(nums, middle+1, end);
        return n;
 
 }
 public static void main(String[] args)
 {
    int[] nums={1,2,9,6,8,0,4,-7};
    System.out.print(sortedArrayToBST(nums));
 }
}
//PARABOY
