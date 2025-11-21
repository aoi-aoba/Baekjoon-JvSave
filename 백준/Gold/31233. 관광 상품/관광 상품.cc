#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
#define ll long long
using namespace std;

ll n, i, a, b, c, ans = 0;

ll mid(ll a, ll b, ll c) {
    return a + b + c - max({a, b, c}) - min({a, b, c});
}

int main(void) {
    fastio();
    cin >> n >> a >> b;
    ans = min(a, b);
    for (i = 3; i <= n; i++) {
        cin >> c;
        ans = max(ans, min(b, c));
        ans = max(ans, mid(a, b, c));
        a = b;
        b = c;
    }

    cout << ans;
    return 0;
}