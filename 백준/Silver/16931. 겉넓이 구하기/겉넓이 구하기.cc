#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, m, block[101][101];

int main(void) {
    fastio();

    cin >> n >> m;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> block[i][j];

    int up = n * m;
    int back = 0, left = 0;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (j == 0) back += block[j][i];
            else if (block[j - 1][i] < block[j][i])
                back += block[j][i] - block[j-1][i];
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (j == 0) left += block[i][j];
            else if (block[i][j - 1] < block[i][j])
                back += block[i][j] - block[i][j-1];
        }
    }

    cout << 2 * (up + back + left);
    return 0;
}