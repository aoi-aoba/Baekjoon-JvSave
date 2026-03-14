// LCM
#include <bits/stdc++.h>
#define ll long long
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

ll a, b, t;

int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

int main(void) {
    fastio;
    cin >> t;
    while (t--) {
        cin >> a >> b;
        cout << a * b / gcd(a, b) << '\n';
    }

    return 0;
}