class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<nums1.length;i++)
        {
            if(nums1[i]==0)
            {
                if(k<n)
                {
                    nums1[i] = nums2[k];
                    k++;
                }
            }
        }
        Arrays.sort(nums1);
        
        System.out.print(Arrays.toString(nums1));
    }
    public static void main(String[] args)
    {
      int[] a={1,2,3,0,0,0};
      int[] b={2,3,4};
      int c=3;
      int d=3;
      merge(a,c,b,d);
    }
}
