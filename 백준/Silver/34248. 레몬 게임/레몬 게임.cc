// 레몬 게임
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

// 합이 3의 배수가 아니면 불가능, 2의 개수가 더 많으면 1이랑 짝짓지 않으면 불가능
// 합이 3의 배수이면서 1이 2보다 많으면 2를 짝지어도 남은 1로 3을 만들 수 있음

int n, x, one = 0, two = 0;

int main(void) {
    fastio();
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> x;
        if (x == 1) one++;
        if (x == 2) two++;
    }

    if (one >= two && (one - two) % 3 == 0)
        cout << "Yes";
    else cout << "No";

    return 0;
}