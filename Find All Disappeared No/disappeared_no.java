class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        Set<Integer> hset =new HashSet<>();
        List<Integer> lst =new ArrayList<>();
        for(int i : nums)
        {
            hset.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!hset.contains(i))
            {
                lst.add(i);
            }
        }
        return lst;
    }
}
