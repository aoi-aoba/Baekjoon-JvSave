// 직각삼각형

#include <bits/stdc++.h>
#define ll long long
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

struct Dot {
    ll x, y;
};

ll square(ll a, ll b) {
    return (a - b) * (a - b);
}

// 빗변 L과 다른 두 면 s, t에 대하여 L+s+t = 2L, s+t=L이 됨. 즉 피타고라스 정리
bool isTriangle(Dot a, Dot b, Dot c) {
    ll ab = square(a.x, b.x) + square(a.y, b.y);
    ll ac = square(a.x, c.x) + square(a.y, c.y);
    ll bc = square(b.x, c.x) + square(b.y, c.y); 
    if (max({ab, bc, ac}) * 2 == ab + bc + ac) return true;
    return false;
}

int main(void) {
    fastio();
    ll N, i, j, k, cnt = 0;
    Dot dots[1515];

    cin >> N;
    for (i = 1; i <= N; i++) {
        cin >> dots[i].x >> dots[i].y;
        for (j = 1; j < i; j++)
            for (k = j + 1; k < i; k++)
                if (isTriangle(dots[i], dots[j], dots[k]))
                    cnt++;
    }

    cout << cnt;
    return 0;
}