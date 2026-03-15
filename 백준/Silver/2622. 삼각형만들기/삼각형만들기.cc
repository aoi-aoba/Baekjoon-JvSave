// 삼각형 만들기
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

int n, cnt;

// 삼각부등식에 의해 가장 긴 변 < 다른 두 변의 합이면 삼각형임
bool isTriangle(int a, int b, int c) {
    return max({a, b, c}) < a + b + c - max({a, b, c});
}

// 증가순열을 만들면 됨!
void makeTriangle(int n) {
    for (int i = 1; i <= n / 2; i++) {
        for (int j = i; j <= n / 2; j++) {
            int k = n - (i + j);
            if (k < i || k < j) continue;
            if (isTriangle(i, j, k)) cnt++;
        }
    }
}

int main(void) {
    fastio;
    cin >> n;
    makeTriangle(n);
    cout << cnt;
    return 0;
}