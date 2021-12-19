#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {`
        int n = nums.size();
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return {i, j};
                }
            }
        }
        return {};
    }
};

int main()
{
    Solution solution;
    vector<int> nums{2, 3, 5, 7};
    vector<int> result = solution.twoSum(nums, 5);
    for (int i: result){
        cout << i << endl;
    }
    return 0;
}