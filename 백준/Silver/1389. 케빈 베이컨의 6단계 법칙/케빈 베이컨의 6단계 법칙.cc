#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

vector<vector<int>> v;
vector<bool> visited;
queue<pair<int, int>> q;

int n, m, a, b, cnt, idx = 1, arr[101];

void bfs(int node, int depth) {
    q.push({node, depth});
    visited[node] = true;

    while (!q.empty()) {
        int cur = q.front().first;
        int curdepth = q.front().second;
        q.pop();

        cnt += curdepth;
        for (auto nxt : v[cur]) {
            if (!visited[nxt]) {
                visited[nxt] = true;
                q.push({nxt, curdepth + 1});
            }
        }
    }
}

int main(void) {
    fastio();
    cin >> n >> m;
    v.resize(n + 1);

    for (int i = 1; i <= m; i++) {
        cin >> a >> b;
        if (find(v[a].begin(), v[a].end(), b) == v[a].end()) {
            v[a].push_back(b); v[b].push_back(a);
        }
    }

    for (int i = 1; i <= n; i++) {
        cnt = 0;
        visited.assign(n + 1, false);
        bfs(i, 0);
        arr[i] = cnt;
        if (arr[idx] > arr[i]) idx = i;
    }

    cout << idx << '\n';

    return 0;
}