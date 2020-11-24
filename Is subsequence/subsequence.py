class Solution(object):
    def isSubsequence(self, s, t):
        
        i = 0
        j = 0

        while j <= len(t)-1 and i <= len(s)-1:
            if s[i] == t[j]:
                i += 1
            j += 1

        return i == len(s)
