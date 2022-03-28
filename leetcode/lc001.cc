#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> map;
        for (int i = 0; i < nums.size(); i++)
        {
            unordered_map<int, int>::iterator it = map.find(target - nums[i]);
            if (it != map.end())
            {
                return {it->second, i};
            }
            map[nums[i]] = i;
        }

        return {};
    }
};

int main()
{
    Solution solution;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> nums1 = {3, 2, 4};
    int target1 = 6;
    vector<int> result = solution.twoSum(nums1, target1);
    cout << "[";
    for (vector<int>::iterator it = result.begin(); it != result.end(); ++it)
    {
        cout << (*it);
        if(it != result.end() - 1){
            cout<< ", ";
        }
    }
    cout << "]" << endl;
}