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
    int maxSubArray(vector<int> &nums)
    {
        int result = nums[0], sum = 0;
        for (int i : nums)
        {
            if (sum > 0)
            {
                sum += i;
            }
            else
            {
                sum = i;
            }
            result = max(result, sum);
        }
        return result;
    }
};

int main()
{
    Solution solution;
    vector<int> nums = {6, -1, -4, 5, 2, 3};
    cout << solution.maxSubArray(nums) << endl;
    return 0;
}