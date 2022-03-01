class Solution:
    def countBits(self, n: int) -> List[int]:
        if(n == 0):
            return [0]

        # dp = {0: 0, 1: 1, 2: 1}

        @lru_cache
        def count_for(num: int):

            if(num == 0):
                return 0

            q = num//2
            r = num % 2

            temp = r

            return count_for(q) + temp

        ans = [0]

        temp = 0b0
        count = 0

        for i in range(1, n+1):
            ans.append(count_for(i))

        # print(f'for {n} -> {ans}')

        return ans