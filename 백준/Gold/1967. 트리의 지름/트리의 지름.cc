// 트리의 지름
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
#define node pair<int, int>
using namespace std;

int n, p, c, w, farNode, maxDist;
vector<node> tree[10001];
bool visited[10001];

void dfs(int num, int dist) {
    visited[num] = true;
    if (dist > maxDist) {
        maxDist = dist;
        farNode = num;
    }
    
    for (auto [nxt, w]: tree[num])
        if (!visited[nxt]) dfs(nxt, dist + w);
}

int main(void) {
    fastio();
    cin >> n;
    // 트리는 무방향 간선
    for (int i = 0; i < n - 1; i++) {
        cin >> p >> c >> w;
        tree[p].push_back({c, w});
        tree[c].push_back({p, w});
    }

    dfs(1, 0); // 임의 노드로 시작
    memset(visited, false, sizeof(visited));
    
    maxDist = 0;
    dfs(farNode, 0); // 가장 먼 노드로부터 dfs
    cout << maxDist;

    return 0;
}