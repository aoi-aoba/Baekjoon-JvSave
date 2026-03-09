// 수 묶기
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, temp, zeros = 0, ones = 0, ret = 0;
vector<int> minus_v, plus_v;

void bind() {
    // 음수가 존재한다는 가정 하에 음수는 짝수개로 서로 묶어서 마이너스 상쇄
    if (minus_v.size() > 0) {
        for (int i = 0; i + 1 < minus_v.size(); i += 2)
            ret += minus_v[i] * minus_v[i + 1];
        if (minus_v.size() % 2 == 1) {
            if (zeros > 0) zeros--;
            // 만약 0이 있는데 음수가 처리되지 않는 게 있다면 0을 곱해서 제거할 수 있음
            else ret += minus_v[minus_v.size() - 1];
            // 0이 없다면 절댓값이 가장 작은 음수를 남겨두는 것이 비교적 유리함
        }
    }
    // 양수가 존재한다는 가정 하에 큰 수부터 두 개씩 묶기
    if (plus_v.size() > 0) {
        for (int i = 0; i + 1 < plus_v.size(); i += 2)
            ret += plus_v[i] * plus_v[i + 1];
        if (plus_v.size() % 2 == 1)
            ret += plus_v[plus_v.size() - 1];
    }
    // 1은 곱하면 손해이므로 따로 합으로 처리
    if (ones > 0) ret += ones;
}

int main(void) {
    fastio();
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        if (temp < 0) minus_v.push_back(temp);
        else if (temp > 1) plus_v.push_back(temp);
        else if (temp == 1) ones++;
        else zeros++;
    }

    if (minus_v.size() > 0)
        sort(minus_v.begin(), minus_v.end());
    if (plus_v.size() > 0 )
        sort(plus_v.begin(), plus_v.end(), greater<>());

    bind();
    cout << ret;
    return 0;
}