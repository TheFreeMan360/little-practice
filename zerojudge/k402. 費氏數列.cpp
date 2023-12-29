#include<iostream>
#include<math.h>
#define ll long long
using namespace std;

int main(){
    int m;
    cin >> m;
    ll f1 = 0, f2 = 1;
    for(ll num = 2; num < m; num++){
        ll rlst = f1 + f2;
        f1 = f2;
        f2 = rlst;
    }
    cout << f2 << "\n";
    return 0;
}