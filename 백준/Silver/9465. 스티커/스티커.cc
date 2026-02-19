#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int t, n;
int sticker_board[2][101010], dp[3][101010];
vector<int> answer;

int go(int n) {
    dp[0][0] = sticker_board[0][0];
    dp[1][0] = sticker_board[1][0];
    dp[2][0] = 0;

    for (int i = 1; i < n; i++) {
        dp[0][i] = max(dp[1][i-1], dp[2][i-1]) + sticker_board[0][i];
        dp[1][i] = max(dp[0][i-1], dp[2][i-1]) + sticker_board[1][i];
        dp[2][i] = max(dp[0][i-1], dp[1][i-1]);
    }

    return max(dp[0][n-1], dp[1][n-1]);
}

int main(void) {
    fastio();

    cin >> t;
    while (t--) {
        cin >> n;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < n; j++)
                cin >> sticker_board[i][j];
        answer.push_back(go(n));
    }

    for (auto item: answer)
        cout << item << '\n';

    return 0;
}