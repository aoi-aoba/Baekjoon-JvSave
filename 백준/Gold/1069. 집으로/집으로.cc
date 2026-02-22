#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int main(void) {
    fastio();

    int x, y, d, t;
    cin >> x >> y >> d >> t;

    double dist = sqrt((double)x * x + (double)y * y);
    double ans = dist;  // 그냥 걷기

    int jump = dist / d;

    if (jump > 0) {
        // 점프 후 남은 거리 걷기
        ans = min(ans, jump * (double)t + (dist - jump * d));
        // 한 번 더 점프
        ans = min(ans, (jump + 1) * (double)t);
    } else {
        // 점프 0번
        ans = min(ans, t + (d - dist));  // 한 번 점프 후 되돌아오기
        ans = min(ans, 2.0 * t);         // 두 번 점프
    }

    cout << fixed << setprecision(10) << ans;

    return 0;
}