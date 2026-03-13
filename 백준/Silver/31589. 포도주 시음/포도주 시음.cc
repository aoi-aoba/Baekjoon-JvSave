// 포도주 시음
#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, k;

int main(void) {
    fastio();
    cin >> n >> k;
    vector<ll> v(n);

    for (int i = 0; i < n; i++)
        cin >> v[i];
    
    sort(v.begin(), v.end());

    // 첫 포도주가 최대일 때 다음 포도주가 0이 됨에 따라 항상 유리해짐
    ll ans = v[n - 1];
    int lft = 0, rht = n - 2, cnt = k - 1;

    // 최대  + abs(최소 - 최대) + abs(최소 - 최대) + ... 를 반복
    while (cnt > 1) {
        ans += v[rht--] - v[lft++];
        cnt -= 2; // 마지막 1개 남아봐야 어차피 0으로 선택됨, 의미 없음
    }

    cout << ans;
    return 0;
}