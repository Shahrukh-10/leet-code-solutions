class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        sb=sb.reverse();
        String t=sb.toString();
        System.out.println(t);
        System.out.print(s);

        if(t.equals(s))
        {
            return true;
        }
        else
        {    
            return false;
        }   
    }
    public static void main(String[] args
    (
        int x=121;
        System.out.print(isPalindrome(x));
    )
  }
