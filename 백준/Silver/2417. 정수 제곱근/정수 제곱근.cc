#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int main(void) {
    fastio();
    ll n;
    cin >> n;

    ll q = sqrt(n);
    if (q * q < n) cout << q + 1;
    else cout << q;

    return 0;
}