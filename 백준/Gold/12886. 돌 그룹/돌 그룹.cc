// 돌 그룹
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int s, visited[1501][1501];
bool ret = false;

pair<int, int> find_and_remake(int x, int y) {
    if (x > y) swap(x, y);
    int nx = 2 * x, ny = y - x;
    if (nx > ny) swap(nx, ny);
    return {nx, ny};
}

void bfs(int a, int b) {
    queue<pair<int, int>> q;
    q.push({a, b});
    visited[a][b] = 1;

    while (!q.empty()) {
        auto [ca, cb] = q.front();
        q.pop();

        int cc = s - (ca + cb);
        if (ca == cb && ca == cc) {
            ret = true;
            return;
        }

        vector<pair<int,int>> nexts;
        if (ca != cb) nexts.push_back(find_and_remake(ca, cb));
        if (ca != cc) nexts.push_back(find_and_remake(ca, cc));
        if (cb != cc) nexts.push_back(find_and_remake(cb, cc));

        for (auto [nx, ny] : nexts) {
            if (!visited[nx][ny]) {
                visited[nx][ny] = 1;
                q.push({nx, ny});
            }
        }
    }
}

int main(void) {
    fastio();
    int a, b, c;
    cin >> a >> b >> c;

    s = a + b + c;
    if (s % 3 != 0) {
        cout << 0;
        return 0;
    }

    bfs(min({a, b, c}), max({a, b, c}));
    cout << (ret ? 1 : 0);
    return 0;
}