// 포린드롬
#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, ans;

void dfs(ll num, ll i) {
    if (num > n) return;
    ++ans;
    dfs(num * 10 + i, i);
}

int main(void) {
    fastio();
    cin >> n;
    for (int i = 1; i <= 9; i++)
        dfs(i, i);
    cout << ans + 1;
    return 0;
}