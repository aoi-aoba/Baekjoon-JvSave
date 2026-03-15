// 십자카드 문제
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

bool clocknums[10101];

void get_clock_num() {
    // 십자카드는 모두 9*9*9*9개 존재, 중복 제거하면 더 적음
    // 위에서부터 ijkl 순서대로 시계방향이라 치자
    for (char i = '1'; i <= '9'; i++) {
        for (char j = '1'; j <= '9'; j++) {
            for (char k = '1'; k <= '9'; k++) {
                for (char l = '1'; l <= '9'; l++) {
                    string a = {i, j, k, l}, b = {j, k, l, i};
                    string c = {k, l, i, j}, d = {l, i, j, k};
                    int cnum = min({stoi(a), stoi(b), stoi(c), stoi(d)});
                    clocknums[cnum] = true;
                }
            }
        }
    }
}

int a[4], m = 10000, cnt = 0;

int main(void) {
    fastio;
    get_clock_num();
    cin >> a[0] >> a[1] >> a[2] >> a[3];

    for (int i = 0; i < 4; i++) {
        int val = a[i % 4] * 1000 + a[(i + 1) % 4] * 100
             + a[(i + 2) % 4] * 10 + a[(i + 3) % 4];
        m = min(val, m);
    }

    // 시계수 최소는 1111이므로 이전 인덱스는 불필요
    // 자기 자신이 몇 번째인지 알려면 이하로, 많이 돌아도 1111~9999의 상수회
    for (int i = 1111; i <= m; i++)
        if (clocknums[i]) cnt++;
    
    cout << cnt;
    return 0;
}