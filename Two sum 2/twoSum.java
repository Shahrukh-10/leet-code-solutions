class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int start = 0;
        int end = numbers.length - 1;
        
        int res[] = new int[2];
        
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum > target)
                end--;
            else if(sum < target)
                start++;
            else {
                res[0] = start + 1;
                res[1] = end + 1;
                break;
            }
        }
        return res;
       }
    public static void main (String[] args)
    {
        int[] arr={1,2,3,5,8};
        int k=6;
        System.out.print(twoSum(arr,k));
    }
}
