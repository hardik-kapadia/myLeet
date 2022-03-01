class Solution:
    def countBits(self, n: int) -> List[int]:
        
        numerOfOnesArr = [0]
        while(len(numerOfOnesArr) < n + 1):
            numerOfOnesArr.extend([x+1 for x in numerOfOnesArr])
        return numerOfOnesArr[:n+1]