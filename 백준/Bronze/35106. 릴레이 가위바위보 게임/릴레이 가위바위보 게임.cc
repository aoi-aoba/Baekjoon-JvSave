// 릴레이 가위바위보 게임

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, a[4], i, x, m=1, M=1;

int main(void) {
    fastio();

    cin >> n;
    while (cin >> x) a[x]++;
    for (i = 1; i < 4; i++)
        a[i] < a[m] ? m = i : 0, a[i] > a[M] ? M = i : 0;
    cout << m << "\n" << M;

    return 0;
}