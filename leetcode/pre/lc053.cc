#include <iostream>
#include <vector>

class Solution
{
public:
    int maxSubArray(std::vector<int>& nums)
    {

    }
};

int main()
{
    Solution solution;
    std::vector<int> nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int result = solution.maxSubArray(nums);
    std::cout << result << std::endl;
}