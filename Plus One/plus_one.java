class Solution {
    public int[] plusOne(int[] digits) {
     
       
           int n=digits.length;
        if(digits[n-1]!=9)
        {
            digits[n-1] += 1;
            return digits;
        }
        else
        {
        String s="";
        for(int i= 0;i<n;i++)
        {
            s=s+digits[i];
        }
        Double k=Double.parseDouble(s)+1;
        s=String.valueOf(k);
         int[] arr=new int[s.length()];
            for(int i=0;i<s.length();i++)
            {
                arr[i]=Character.getNumericValue(s.charAt(i));
            }
            return arr;
        }
        
    }
    public static void main(String[] args)
    {
      System.out.println({1,2,8,4,5,9,1});
    }
}
