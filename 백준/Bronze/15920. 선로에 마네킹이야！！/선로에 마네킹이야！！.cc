// 선로에 마네킹이야!!
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
string s;

int main(void) {
    fastio();
    cin >> n >> s;
    int wnum = 0;
    bool lever = false, leverInB = false;

    for (int i = 0; i < n; i++) {
        if (s[i] == 'P') {
            if (wnum == 0) lever = !lever;
            else if (wnum == 1) leverInB = true;
        } else wnum++;
    }

    if (wnum < 2) cout << 0;
    else if (leverInB) cout << 6;
    else if (lever) cout << 1;
    else cout << 5;
    return 0;
}