#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

struct Dot {
    int x, y;
};

int n, a, b;
int minx = 1e9, maxx = -1e9, miny = 1e9, maxy = -1e9;
Dot dots[51];

bool check(int sx, int sy, int len) {
    for (int i = 0; i < n; i++) {
        int x = dots[i].x;
        int y = dots[i].y;

        bool on_left   = (x == sx) && (sy <= y && y <= sy + len);
        bool on_right  = (x == sx + len) && (sy <= y && y <= sy + len);
        bool on_bottom = (y == sy) && (sx <= x && x <= sx + len);
        bool on_top    = (y == sy + len) && (sx <= x && x <= sx + len);

        if (!(on_left || on_right || on_bottom || on_top))
            return false;
    }
    return true;
}

int main(void) {
    fastio();

    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        minx = min(minx, a);
        maxx = max(maxx, a);
        miny = min(miny, b);
        maxy = max(maxy, b);
        dots[i] = {a, b};
    }

    int len = max(maxx - minx, maxy - miny);

    if (check(minx, miny, len) ||
        check(minx, maxy - len, len) ||
        check(maxx - len, miny, len) ||
        check(maxx - len, maxy - len, len)) {
        cout << len;
    } else {
        cout << -1;
    }

    return 0;
}