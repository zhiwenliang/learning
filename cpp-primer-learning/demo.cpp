#include<iostream>
using std::cout;
using std::endl;

int main() {
    int a = 12, b , c;
    b = a++;
    c = ++a;
    cout << b << endl;
    cout << c << endl;
    return 0; 
}