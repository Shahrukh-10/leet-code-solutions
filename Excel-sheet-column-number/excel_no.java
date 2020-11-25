class Solution {
    public int titleToNumber(String s) {
        char[] letters = s.toCharArray();

        int sum = 0;
        for (int i = letters.length - 1; i >= 0; i--) {
            
            int placeValue = (int) Math.pow(26, letters.length - 1 - i);

            int digitValue = (int) letters[i] - 64;
            
            sum += (digitValue * placeValue);
        }

        return sum;
    }
    public static void main(String[] args)
    {
      System.out.print(titleToNumber("AA");
    }
}
