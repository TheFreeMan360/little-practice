#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    cout << (n < 0? -1 * n: n) << "\n";
    return 0;
}