#include<iostream>
using namespace std;

void D2B(int n){
    if(n == 0){
        return;
    }
    D2B(n / 2);
    cout << (n % 2);
}
int main(){
    int n;
    while(cin>>n){
        D2B(n);
        cout<<'\n';
    }
    
    return 0;
}
