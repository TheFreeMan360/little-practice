#include <bits/stdc++.h>
using namespace std;

bool isArmstrong(int num) {
    int nd = 0;
    for (int n = num; n > 0; n /= 10)
        ++nd;

    int sum = 0;
    for (int n = num; n > 0; n /= 10) {
        int currDigit = n % 10;

        int tmp = 1;
        for (int t = nd; t > 0; --t)
            tmp *= currDigit;

        sum += tmp;
    }
    return sum == num;
}

int main() {
    cin.tie(0);

    int n, m;
    cin >> n >> m;
    bool haveAns = false;
    for (; n <= m; ++n) {
        if (isArmstrong(n)) {
            haveAns = true;
            cout << n << " ";
        }
    }

    cout << (haveAns ? "\n" : "none \n");
    return 0;
}