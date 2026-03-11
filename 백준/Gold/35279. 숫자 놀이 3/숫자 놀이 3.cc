// 숫자 놀이 3

#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

const ll MAX_LIMIT = 10000000000000000LL;
int k, cnt = 0;
vector<ll> powers;
ll b;

int main(void) {
    fastio();
    cin >> b >> k;

    // 오버플로우 체크하며 자릿수 계산을 위한 precompute 진행
    powers.push_back(1);
    while (true) {
        ll last = powers.back();
        // last * b > MAX_LIMIT을 이항해서 체크
        if (last > MAX_LIMIT / b + 1) {
            powers.push_back(MAX_LIMIT + 7); // 오버플로우 방지
            if (powers.size() > 64) break; // 10^18 < (2^4)^18 = 2^64
        } else powers.push_back(last * b);
        if (powers.back() > MAX_LIMIT && powers.size() > 64) break;
    }
    
    priority_queue<ll, vector<ll>, greater<ll>> pq;
    // 기본 b진수가 한 자릿수인 수부터 삽입
    for (ll i = 1; i < b && i <= 1000000; ++i) pq.push(i);

    while (!pq.empty() && cnt < k) {
        ll x = pq.top();
        pq.pop();

        cout << x << '\n';
        cnt++;

        // 현재의 날씬한 수를 부모로 한 새로운 날씬한 수를 생성함
        for (int l = 2; l < (int)powers.size(); ++l) {
            // x * l > MAX_LIMIT의 오버플로우를 이항해서 체크
            if (x > MAX_LIMIT / l) break;

            ll tar = x * l;
            if (tar > MAX_LIMIT) continue; // 안전성 검사
            
            // tar가 B^(l-1)보다 커야 l자리 이상이 보장
            // tar < b^l이어야 l자리를 넘지 않음
            if (tar >= powers[l - 1] &&
                (l >= powers.size() - 1 || tar < powers[l]))
                pq.push(tar);
        }
    }
    return 0;
}