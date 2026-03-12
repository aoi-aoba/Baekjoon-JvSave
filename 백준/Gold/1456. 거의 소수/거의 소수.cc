// 거의 소수
#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

ll cnt(ll n, ll x) {
    ll cnt = 0, mul = x;
    while (mul <= n) {
        cnt++;
        if (n / x < mul) break;
        mul *= x;
    }
    return cnt - 1;
}

bool able[10101010] = {0};
ll a, b;

ll sol(ll n) {
    ll ans = 0;
    for (ll i = 2; i * i <= n; i++) {
        if (able[i]) continue;
        for (ll j = 2; i * j <= 10000000; j++)
            able[i * j] = true;
        ans += cnt(n, i);
    }
    return ans;
}

int main() {
    fastio();
    cin >> a >> b;
    cout << sol(b) - sol(a - 1);
}