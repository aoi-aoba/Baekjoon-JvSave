// 그림

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, m, paint_cnt = 0, max_area = 0;
int visited[505][505], paint[505][505];
int dr[4] = {-1, 1, 0, 0}, dc[4] = {0, 0, -1, 1};

int bfs(int r, int c) {
    queue<pair<int, int>> q;
    q.push({r, c});
    visited[r][c] = 1;
    int cnt = 1;

    while (!q.empty()) {
        auto cur = q.front();
        int cr = cur.first, cc = cur.second;
        q.pop();

        for (int i = 0; i < 4; i++) {
            int nr = cr + dr[i], nc = cc + dc[i];
            if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
            if (!paint[nr][nc] || visited[nr][nc]) continue;
            
            visited[nr][nc] = 1;
            cnt++;
            q.push({nr, nc});
        }
    }

    return cnt;
}

int main(void) {
    fastio();

    cin >> n >> m;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> paint[i][j];
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (paint[i][j] && !visited[i][j]) {
                max_area = max(max_area, bfs(i, j));
                paint_cnt++;
            }
        }
    }

    cout << paint_cnt << '\n' << max_area;
    return 0;
}