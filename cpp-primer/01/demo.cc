#include <iostream>
using std::cout;
using std::cin;
using std::endl;

int main()
{
    int sum = 0, i = 0;
    while (cin >> i)
    {
        sum += i;
    }
    cout << sum << endl;
    return 0;
}