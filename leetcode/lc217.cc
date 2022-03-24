#include <iostream>
#include <vector>
#include <unordered_set>

using std::cout;
using std::endl;
using std::vector;
using std::unordered_set;


class Solution
{
    public:
    bool containsDuplicate(vector<int> &nums)
    {
        unordered_set<int> tmp;
        for(int i = 0;i < nums.size();i++)
        {
            tmp.insert(nums[i]);
        }
        if(tmp.size() != nums.size())
        {
            return true;
        }
        return false;
    }
};

int main()
{
    vector<int> nums = {1, 2, 3, 4};
    Solution solution;
    cout << std::boolalpha << solution.containsDuplicate(nums) << endl;
}