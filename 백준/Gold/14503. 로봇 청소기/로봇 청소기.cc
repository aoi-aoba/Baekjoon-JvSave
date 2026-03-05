// 로봇 청소기
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, m, cr, cc, cdir;
int board[50][50];
pair<int, int> dirs[4] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

int main(void) {
    fastio();
    cin >> n >> m >> cr >> cc >> cdir;

    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> board[i][j];
    
    int clean = 0;
    while (1) {
        if (board[cr][cc] == 0) {
            board[cr][cc] = 2;
            clean++;
        }
        
        int canCleaned = 0;
        for (int d = 0; d < 4; d++) {
            auto [dr, dc] = dirs[d];
            int nr = cr + dr, nc = cc + dc;
            
            if (nr < 0 || nc < 0 || nr >= n || nc >= m) continue;
            if (board[nr][nc] == 0) canCleaned++;
        }

        if (canCleaned == 0) {
            int tdir = (cdir + 2) % 4;
            auto [dr, dc] = dirs[tdir];
            int br = cr + dr, bc = cc + dc;

            if (br < 0 || bc < 0 || br >= n || bc >= m || board[br][bc] == 1)
                break; 
            else cr = br, cc = bc;
        } else {
            cdir = (cdir + 3) % 4;
            auto [dr, dc] = dirs[cdir];
            int nr = cr + dr, nc = cc + dc;

            if (nr >= 0 && nc >= 0 && nr < n && nc < m && !board[nr][nc])
                cr = nr, cc = nc;
        }
    }

    cout << clean;
    return 0;
}