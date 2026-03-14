#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
using namespace std;

long long dp[201][201];

void init_dp(int n, int m) {
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= m; j++) {
            if (i == 0 && j == 0) dp[i][j] = 1;
            else {
                dp[i][j] = 0;
                if (i > 0) dp[i][j] += dp[i-1][j];
                if (j > 0) dp[i][j] += dp[i][j-1];
                if (dp[i][j] > 1e18) dp[i][j] = 1e18; // overflow 방지
            }
        }
    }
}

string go(int n, int m, long long k) {
    string ret = "";
    while (n + m > 0) {
        if (n == 0) { ret += 'z'; m--; }
        else if (m == 0) { ret += 'a'; n--; }
        else {
            long long cnt = dp[n-1][m]; // a를 앞에 놓았을 때 경우의 수
            if (k <= cnt) { ret += 'a'; n--; }
            else { ret += 'z'; k -= cnt; m--; }
        }
    }
    return ret;
}

int main() {
    fastio;
    int n, m;
    long long k;
    cin >> n >> m >> k;

    init_dp(n, m);

    if (k > dp[n][m]) cout << -1;
    else cout << go(n, m, k);

    return 0;
}