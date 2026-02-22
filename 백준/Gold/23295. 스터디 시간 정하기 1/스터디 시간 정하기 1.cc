#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
#define ll long long
using namespace std;

int N, T, K, startTime, endTime, maxLimit = 0, ans = 0;
ll maxSatisfied = 0;
int diff[101010];
ll timeTable[101010], prefixSum[101010];

int main(void) {
    fastio();
    
    // 입력 처리 및 차분 배열 생성
    cin >> N >> T;
    while (N--) {
        cin >> K;
        while (K--) {
            cin >> startTime >> endTime;
            maxLimit = max(endTime, maxLimit);
            diff[startTime]++;
            diff[endTime]--;
        }
    }

    // 누적합의 1차 활용 (차분 배열 -> 시간별 만족도 체크)
    ll cur_cnt = 0;
    for (int i = 0; i <= maxLimit; i++) {
        cur_cnt += diff[i];
        timeTable[i] = cur_cnt;
    }

    // 누적합의 2차 활용 (시간별 만족도 -> 범위별 만족도)
    for (int i = 0; i <= maxLimit; i++)
        prefixSum[i + 1] = prefixSum[i] + timeTable[i];

    ll cur = 0;
    for (int i = 0; i <= maxLimit - T; i++) {
        cur = prefixSum[i + T] - prefixSum[i];
        if (cur > maxSatisfied) {
            maxSatisfied = cur;
            ans = i;
        }
    }

    cout << ans << ' ' << ans + T;
    return 0;
}