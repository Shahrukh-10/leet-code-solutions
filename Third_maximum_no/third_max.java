class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int answer = nums[nums.length - 1], count = 1;

        for (int i = nums.length - 1; i > 0; i--) {

            if (nums[i] != nums[i - 1]) {
                count++;
            }

            if (count == 3) {
                answer = nums[i - 1];
                break;
            }
        }
        return answer;
    }

}
 
 
