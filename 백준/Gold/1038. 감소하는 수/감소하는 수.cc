// 감소하는 수
#include <bits/stdc++.h>
#define ll long long
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

int n;
vector<ll> v;

void dfs(ll num, int last) {
    // num 뒤로 마지막 자리 last보다 더 작은 숫자 붙이기
    v.push_back(num);
    for (int i = 0; i < last; i++)
        dfs(num * 10 + i, i);
}

int main(void) {
    fastio;
    for (int i = 0; i <= 9; i++) dfs(i, i);
    sort(v.begin(), v.end());

    cin >> n;
    if (n >= v.size()) cout << -1;
    else cout << v[n];
    
    return 0;
}