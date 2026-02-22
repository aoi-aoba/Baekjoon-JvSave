#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, a[1001], dp[1001], mx = 0, ret = 0;

int main(void) {
    fastio();

    cin >> n;
    for (int i = 1; i <= n; i++) cin >> a[i];
    for (int i = 1; i <= n; i++) {
        mx = 0;
        for (int j = i - 1; j >= 1; j--)
            if (a[j] < a[i]) mx = max(mx, dp[j]);
        dp[i] = mx + 1;
        ret = max(ret, dp[i]);
    }

    cout << ret << '\n';

    return 0;
}