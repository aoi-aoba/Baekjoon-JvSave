#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
ll board[101][101], dp[101][101];

int main(void) {
    fastio();

    cin >> n;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> board[i][j];

    dp[0][0] = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            ll dist = board[i][j];
            if (dist == 0) continue;
            if (i + dist < n)
                dp[i + dist][j] += dp[i][j];
            if (j + dist < n)
                dp[i][j + dist] += dp[i][j];
        }
    }

    cout << dp[n - 1][n - 1];
    return 0;
}