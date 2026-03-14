// 큰 수 A + B (2)
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

string a, b;

void seteq() {
    int as = a.size(), bs = b.size();
    int diff = abs(as - bs);

    string s = "";
    for (int i = 0; i < diff; i++) s += "0";

    if (as < bs) a = s + a;
    else if (as > bs) b = s + b;
}

string largesum() {
    int r = a.size(), up = 0;
    string res = "";
    for (int i = r - 1; i >= 0; i--) {
        int tsum = (a[i] - '0') + (b[i] - '0') + up;
        res = to_string(tsum % 10) + res;
        up = tsum / 10;
    }
    if (up == 1) res = "1" + res;
    return res;
}

int main(void) {
    fastio();
    cin >> a >> b;
    seteq();
    cout << largesum();
    return 0;
}