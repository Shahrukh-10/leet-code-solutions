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
}
