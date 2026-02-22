// 아 맞다 마늘

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, m;
string s;
set<string> a;

int main(void) {
    fastio();

    cin >> n;
    m = n - 1;

    // 집합에 넣었다가 빼면 됨
    while(n--) cin >> s, a.insert(s);
    while(m--) cin >> s, a.erase(s);

    cout << *a.begin();
    return 0;
}