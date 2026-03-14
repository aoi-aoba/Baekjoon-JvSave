// 수 이어 쓰기 2
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define ll long long
using namespace std;

ll n, k;

int main(void) {
    fastio;
    cin >> n >> k;
    
    // 숫자 범위의 개수는 항상 10^n - 10^(n-1)
    ll dig = 1, srt = 1, cnt = 9;
    while (k > dig * cnt) {
        k -= dig * cnt;
        dig++;
        srt *= 10; // 찾는 걸 시작하는 구간
        cnt *= 10;
    }

    // 수 위치는 시작구간 + (남은 문자수 / 숫자길이)
    ll num = srt + (k - 1) / dig;
    if (num > n) cout << -1;
    else cout << to_string(num)[(k - 1) % dig];
    
    return 0;
}