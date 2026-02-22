// 스텔라가 치킨을 선물했어요

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
#define Pair pair<int, int>
using namespace std;

int n, c;

int main(void) {
    fastio();
    cin >> n;
    vector<pair<int, int>> v(n);
    for (auto &i : v) cin >> i.first >> i.second;

    // 해결 개수가 많으면 더 높고, 개수 같으면 패널티가 더 적어야 높고
    sort(v.begin(), v.end(), [](auto &a, auto &b) {
        return a.first == b.first ? a.second < b.second : a.first > b.first;
    });

    // 5등(index 4)하고 개수 같아야 함
    for (int i = 5; i < n && v[i].first == v[4].first; i++) c++;
    cout << c;
    return 0;
}