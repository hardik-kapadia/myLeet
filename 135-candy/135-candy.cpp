class Solution {
public:
    int candy(vector<int>& ratings) {
        if (ratings.size() == 1)
        return {1};

    int len = ratings.size();

    int candiesL[len];
    int candiesR[len];

    for (int i = 0; i < len; i++)
    {
        candiesL[i] = 1;
        candiesR[i] = 1;
    }

    for (int i = 1; i < len; i++)
    {
        if (ratings[i] > ratings[i - 1])
        {
            candiesL[i] = candiesL[i - 1] + 1;
        }
    }

    for (int i = len - 2; i >= 0; i--)
    {
        if (ratings[i] > ratings[i + 1])
        {
            candiesR[i] = candiesR[i + 1] + 1;
        }
    }

    int candies[len];

    int total = 0;

    for (int i = 0; i < len; i++)
    {
        candies[i] = candiesR[i] > candiesL[i] ? candiesR[i] : candiesL[i];
        total += candies[i];
    }
    return total;
    }
};