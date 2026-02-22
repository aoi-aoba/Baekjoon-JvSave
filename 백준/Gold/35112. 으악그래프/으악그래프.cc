// 으악그래프

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

/* connected graph의 최소 형태인 트리는 M = N - 1, 이 경우 간선 1개로도 분리 가능
   만약 N = M인 경우에는 1개의 사이클이 생기고, (사이클이나 비사이클에서 2개 제거) 혹은
   (사이클과 비사이클 1개씩 제거) 형태가 되는데 어느 쪽이든 분리될 수 있음
   여기에서 M = N + 1부터는 2개의 사이클이 생기고, 불가능해지는 어떤 경우가 반드시 존재함
*/

int n, m;

int main(void) {
    fastio();

    cin >> n >> m;
    cout << (m <= n ? "Yes" : "No");

    return 0;
}