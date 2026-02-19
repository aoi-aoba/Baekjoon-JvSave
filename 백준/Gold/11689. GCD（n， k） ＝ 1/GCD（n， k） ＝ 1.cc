#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int main(void) {
    fastio();

    ll n, ans;
    cin >> n;
    ans = n; // 오일러 피 함수 phi(n) <= n

    // phi(n) = n PI_p|n (1 - 1/p)를 계산
    for (ll i = 2; i * i <= n; i++) { // 소인수분해하면서
        if (n % i == 0) { // 소인수인 i에 대해
            while (n % i == 0) n /= i; // 같은 소인수 여러 번 제거
            ans -= ans / i;
        }
    }

    // 루프 돌고 나온 n이 1이 아니면 sqrt(n)보다 큰 소수가 남은 것
    if (n > 1) ans -= ans / n;
    cout << ans;

    return 0;
}