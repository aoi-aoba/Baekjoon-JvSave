#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, dasom, ans;
priority_queue<int> pq;

int main(void) {
    fastio();

    cin >> n >> dasom;
    while (--n) {
        int x;
        cin >> x;
        pq.push(x);
    }

    while (!pq.empty() && dasom <= pq.top()) {
        int max = pq.top();
        pq.pop();
        pq.push(max - 1);
        dasom++;
        ans++;
    }

    cout << ans;
    return 0;
}