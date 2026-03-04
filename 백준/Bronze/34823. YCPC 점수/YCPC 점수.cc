// YCPC 점수
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int y, c, p;

int main(void) {
    fastio();
    cin >> y >> c >> p;
    cout << min({y, c / 2, p});
    return 0;
}