#include <bits/stdc++.h>
using namespace std;

int go(int n, int r, int c) {
    if (n == 0) return 0;
    int half = pow(2, n-1), size = half * half;

    if (r < half && c < half)
        return 0 * size + go(n-1, r, c);
    else if (r < half && c >= half)
        return 1 * size + go(n-1, r, c-half);
    else if (r >= half && c < half)
        return 2 * size + go(n-1, r-half, c);
    else return 3 * size + go(n-1, r-half, c-half);
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int n, r, c;
    cin >> n >> r >> c;
    cout << go(n, r, c);

    return 0;
}