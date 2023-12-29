#include<iostream>
using namespace std;

int main(){
    int n;
    while(cin >> n){
        for(int num = 1; num > 0 && num < n; ++num){
            if(num % 7 == 0){
              continue;  
            }
            
            if(num == n - 1){
                cout << num;
                continue;
            }
            cout << num << " ";
        }
        cout << "\n";
    }
    return 0;
}