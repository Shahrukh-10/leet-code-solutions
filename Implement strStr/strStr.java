class Solution {
    public int strStr(String haystack, String needle) 
    {   
        
       if(haystack=="")
       {
           return 0;
       }
        if(needle=="")
        {
            return 0;
        }
       
        if(haystack.contains(needle))
        {
            int ind = haystack.indexOf(needle);
            
            return ind;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args)
    {
        String haystack="hello";
        String needle="ll";
        System.out.print(strStr(haystack,needle);
    }
}
//PARABOY
