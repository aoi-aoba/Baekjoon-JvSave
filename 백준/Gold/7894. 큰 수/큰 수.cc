// 큰 수
#define _USE_MATH_DEFINES
#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

ll t, m;

ll kamenetsky_formula(ll n) {
    if (n <= 1) return 1;
    double x = n * log10(n / M_E) + log10(2 * M_PI * n) / 2.0;
    return floor(x) + 1;
}

int main(void) {
    fastio();
    cin >> t;
    while (t--) {
        cin >> m;
        cout << kamenetsky_formula(m) << '\n';
    }
    return 0;
}