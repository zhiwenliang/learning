#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    vector<vector<int>> matrixReshape(vector<vector<int>> &mat, int r, int c)
    {
        if(mat.size() > 0)
        {
            if(mat[0].size() > 0)
            {
                vector<vector<int>> result(r);
                for (vector<int> row: result)
                {
                    row.resize(c);
                }
                int i = 0;
                int j = 0;
                for (vector<int> row : mat)
                {
                    for(int col : row)
                    {
                        if(j == c)
                        {
                            i++;
                            j = 0;
                            result[i][j] = col;
                        } else {
                            result[i][j] = col;
                            j++;
                        }
                    }
                }
                return result;
            }
        }
        return mat;
    };

    int printMat(vector<vector<int>> &mat)
    {
        for(vector<int> row : mat)
        {
            for(int col : row)
            {
                cout << col << endl;
            }
        }
        return 0;
    }
};

int main()
{
    Solution solution;
    vector<vector<int>> mat = {{1, 2}, {3, 4}};
    vector<vector<int>> result = solution.matrixReshape(mat, 1, 4);
    solution.printMat(result);
    return 0;
}