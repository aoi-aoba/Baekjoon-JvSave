// 우리의 다정한 계절 속에
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int getSeason(int y, int m) {
    if (m == 12) return 0;
    if (m <= 2) return 0;
    if (m <= 5) return 1;
    if (m <= 8) return 2;
    return 3;
}

int main() {
    fastio();

    int y, m, d;
    cin >> y >> m >> d;

    int startY = 2015, startSeason = 0;
    int curSeason = getSeason(y, m);

    if (m == 12) y++;
    int startValue = startY * 4 + startSeason;
    int curValue = y * 4 + curSeason;

    cout << curValue - startValue + 1;
}