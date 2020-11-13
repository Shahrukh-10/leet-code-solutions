https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
        if (root==null)
        {
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        if(l>r)
        {
            return l+1;
        }
        else
        {
            return r+1;
        }
    }
  public static void main(String[] args)
  {
    int[] root={3,9,20,null,null,15,7};
    System.out.print(maxDepth(root));
  }
}
