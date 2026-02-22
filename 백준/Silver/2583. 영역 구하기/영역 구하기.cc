// 영역 구하기

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int m, n, k, cnt = 0;
int wallmap[101][101], range[101];
int dx[4] = {-1, 1, 0, 0};
int dy[4] = {0, 0, -1, 1};

void bfs(int a, int b) {
    queue<pair<int, int>> q;
    q.push({a, b});
    wallmap[a][b] = cnt;
    range[cnt]++;

    while (!q.empty()) {
        auto cur = q.front();
        int r = cur.first, c = cur.second;
        q.pop();
        
        for (int i = 0; i < 4; i++) {
            int nr = r + dx[i], nc = c + dy[i];

            if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
            if (wallmap[nr][nc] != 0) continue;

            wallmap[nr][nc] = cnt;
            range[cnt]++;
            q.push({nr, nc});
        }
    }
}

int main(void) {
    fastio();
    cin >> m >> n >> k;

    while (k--) {
        int x1, x2, y1, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        for (int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                wallmap[y][x] = -1; // -1은 못 가는 벽
            }
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (wallmap[i][j] == 0) {
                cnt++;
                bfs(i, j);
            }
        }
    }

    sort(range + 1, range + cnt + 1);

    cout << cnt << '\n';
    for (int i = 1; i <= cnt; i++) {
        cout << range[i] << ' ';
    }
    cout << '\n';

    return 0;
}