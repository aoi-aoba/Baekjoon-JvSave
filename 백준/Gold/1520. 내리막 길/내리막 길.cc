// 내리막 길
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int m, n, arr[501][501], dp[501][501];
int dr[4] = {-1, 1, 0, 0}, dc[4] = {0, 0, -1, 1};

int dfs(int r, int c) {
    if (r < 0 || r >= m || c < 0 || c >= n) return 0;
    if (dp[r][c] != -1) return dp[r][c];
    if (r == 0 && c == 0) return 1;

    dp[r][c] = 0;
    for (int i = 0; i < 4; i++) {
        int nr = r + dr[i], nc = c + dc[i];
        if (arr[nr][nc] > arr[r][c])
            dp[r][c] += dfs(nr, nc);
    }

    return dp[r][c];
}

int main(void) {
    fastio();
    cin >> m >> n;
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            cin >> arr[i][j];

    memset(dp, -1, sizeof(dp));
    cout << dfs(m - 1, n - 1);
    return 0;
}