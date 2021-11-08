class Solution:
    # too slow，time complexity is O(n^3)
    def lengthOfLongestSubstring(self, s: str) -> int:
        # use ASCII table to check duplicate letters
        def check(start, end):
            chars = [0] * 128
            for i in range(start, end + 1):
                c = s[i]
                chars[ord(c)] += 1
                if chars[ord(c)] > 1:
                    return False
                return True

        n = len(s)

        res = 0
        for i in range(n):
            for j in range(i, n):
                if check(i, j):
                    res = max(res, j - i + 1)
        return res

class Solution1:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chars = [0] * 128
        n = len(s)
        for i in range(n):
            c = s[i]
            if (ord(c) > 1):
                chars[i+1] += 1