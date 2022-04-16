#include <iostream>
#include <vector>
#include <unordered_map>

class Solution
{
public:
    bool containsDuplicate(std::vector<int> &nums)
    {
        std::unordered_map<int, int> map = {};
        for (int num : nums)
        {
            map[num] = 1;
        }
        if (map.size() != nums.size())
        {
            return true;
        }
        return false;
    }
};

int main()
{
    Solution solution;
    std::vector<int> nums = {1, 2, 3, 4, 1};
    bool result = solution.containsDuplicate(nums);
    std::cout << std::boolalpha << result << std::endl;
}