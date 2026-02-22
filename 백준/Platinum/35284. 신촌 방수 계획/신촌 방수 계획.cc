#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

struct Edge {
    int u, v;
    ll w;
    bool is_umbrella; // 우산 간선 구분
    bool operator<(const Edge& other) const {
        return w < other.w;
    }
};

int parent[100005], n, m, cost, u, v;
ll w;
vector<Edge> all_edges, roof_edges;

int Find(int x) {
    if (parent[x] == x) return x;
    return parent[x] = Find(parent[x]);
}

bool Union(int x, int y) {
    x = Find(x);
    y = Find(y);
    if (x != y) {
        parent[y] = x;
        return true;
    }
    return false;
}

int main() {
    fastio();
    cin >> n >> m;

    // 우산 보관함을 0번 노드와 연결할 간선으로 봄
    for (int i = 1; i <= n; ++i) {
        cin >> cost;
        all_edges.push_back({0, i, cost, true});
    }

    // 지붕 입력 간선 제작
    for (int i = 0; i < m; ++i) {
        cin >> u >> v >> w;
        all_edges.push_back({u, v, w, false});
        roof_edges.push_back({u, v, w, false});
    }

    // 보관함 없이 지붕으로만 연결하는 경우는 반드시 존재하고 보관함이 비싸면 그렇게 해야함
    sort(roof_edges.begin(), roof_edges.end());
    for (int i = 1; i <= n; ++i) parent[i] = i;
    
    ll only_roof_cost = 0;
    int roof_cnt = 0;
    for (const auto& e : roof_edges) {
        if (Union(e.u, e.v)) {
            only_roof_cost += e.w;
            roof_cnt++;
        }
    }

    // 가상 우산 공급의 0번 노드와 건물을 이은 상태에서 MST를 만들어 우산의 경우 체크
    sort(all_edges.begin(), all_edges.end());
    for (int i = 0; i <= n; ++i) parent[i] = i;
    
    ll with_umbrella_cost = 0;
    int total_cnt = 0;
    for (const auto& e : all_edges) {
        if (Union(e.u, e.v)) {
            with_umbrella_cost += e.w;
            total_cnt++;
            if (total_cnt == n) break; // 노드 개수는 n+1이 됨 (0번 추가)
        }
    }

    cout << min(only_roof_cost, with_umbrella_cost) << '\n';
    return 0;
}