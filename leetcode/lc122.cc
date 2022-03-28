#include <iostream>
#include <vector>

using namespace std;

/**
 * @brief Dynamic Programming
 *
 */
class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int len = prices.size();
        if (len < 2)
        {
            return 0;
        }

        int dp[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++)
        {
            dp[i][0] = max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[len - 1][0];
    }
};

/**
 * @brief Greedy
 * 
 */
class Solution1
{
public:
    int maxProfit(vector<int> &prices)
    {
        int len = prices.size();
        if (len < 2)
        {
            return 0;
        }

        int cash = 0, hold = -prices[0];
        int preCash = cash, preHold = hold;
        for (int i = 1; i < len; i++)
        {
            cash = max(preCash, preHold + prices[i]);
            hold = max(preHold, preCash - prices[i]);

            preCash = cash;
            preHold = hold;
        }

        return cash;
    }
};

int main()
{
    vector<int> prices = {7, 1, 5, 3, 6, 4};
    Solution solution;
    cout << solution.maxProfit(prices) << endl;
    Solution1 solution1;
    cout << solution1.maxProfit(prices) << endl;
}