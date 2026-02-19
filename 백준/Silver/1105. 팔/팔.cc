#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int main(void) {
    fastio();

    int cnt = 0;
    string l, r;
    cin >> l >> r;
    
    if (l.size() != r.size())
        cout << 0;
    else {
        for (int i = 0; i < l.size(); i++) {
            if (l[i] != r[i]) break;
            else if (l[i] == '8') cnt++;
        }
        cout << cnt;
    }

    return 0;
}