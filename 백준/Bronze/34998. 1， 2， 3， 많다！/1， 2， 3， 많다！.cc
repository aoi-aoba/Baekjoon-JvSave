// 1, 2, 3, 많다!
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, x;

int main(void) {
    fastio();
    cin >> n;

    while (n--) {
        cin >> x;
        
        int sum = 0;
        bool hasex = false;
        char ch;

        for (int i = 0; i < 2 * x + 1; i++) {
            cin >> ch;
            if (ch == '+') continue;
            else if (ch == '!') hasex = true;
            else sum += (ch - '0');
        }

        if (hasex || sum > 9) cout << "!\n";
        else cout << sum << '\n';
    }

    return 0;
}