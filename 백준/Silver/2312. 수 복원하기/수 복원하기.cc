// 수 복원하기
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int t, n;
bool isprime[100001];

void sieve() {
    memset(isprime, true, sizeof(isprime));
    isprime[0] = isprime[1] = false;
    for (int i = 2; i * i < 100001; i++) {
        if (!isprime[i]) continue;
        for (int j = i * i; j < 100001; j += i)
            isprime[j] = false;
    }
}

void factorize(int n) {
    for (int d = 2; d * d <= n; d++) {
        int cnt = 0;
        while (n % d == 0) {
            n /= d;
            cnt++;
        }
        if (cnt > 0) cout << d << ' ' << cnt << '\n';
    }
    if (n > 1) cout << n << " 1\n";
}

int main(void) {
    fastio();
    sieve();

    cin >> t;
    while (t--) {
        cin >> n;
        factorize(n);
    }
    return 0;
}