class Solution {
    public int firstUniqChar(String s) {
         int[] charCount = new int[26];
        for(int i=0;i<s.length();i++)
        {
            charCount[s.charAt(i)-'a']=charCount[s.charAt(i)-'a']+ 1; 
        }
        for(int i=0;i<s.length();i++)
        {
            if(charCount[s.charAt(i)-'a']<2)
                return i;
        }
        return -1;
}
}
