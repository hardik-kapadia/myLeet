class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        temp = 0

        for c in s:

            i = temp

            while i < len(t):
                if t[i] == c:
                    break
                i += 1

            if i == len(t):
                return False

            temp = i+1

        return True