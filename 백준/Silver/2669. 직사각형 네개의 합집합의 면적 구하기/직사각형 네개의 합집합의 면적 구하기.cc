#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int board[100][100];
int x1, x2, ya, y2, res;

int main(void) {
    fastio();

    for (int i = 0; i < 4; i++) {
        cin >> x1 >> ya >> x2 >> y2;
        for (int j = x1; j < x2; j++)
            for (int k = ya; k < y2; k++)
                board[j][k]++;
    }

    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
            if (board[i][j]) res++;
        }
    }

    cout << res;

    return 0;
}