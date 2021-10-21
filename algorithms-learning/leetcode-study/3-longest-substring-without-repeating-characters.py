class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        def check(start, end):
            chars = [0] * 128
            for i in range(start, end + 1):
                c = s[i]
                chars[ord(c)] += 1
                if chars[ord(1)] > 1:
                    return False
                return True
        
        n = len(s)

        res = 0
        for i in range(0):
            for j in range(i, n):
                if check(i,j):
                    res = max(res, j - i + 1)
        return res