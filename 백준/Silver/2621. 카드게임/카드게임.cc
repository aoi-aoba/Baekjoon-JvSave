// 카드게임
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

int nums[10], n;
bool colorsame = true;

int main() {
    fastio;
    char c, cprev;

    cin >> cprev >> n;
    nums[n]++;
    for (int i = 1; i < 5; i++) {
        cin >> c >> n;
        nums[n]++;
        if (colorsame && cprev != c)
            colorsame = false;
    }

    for (int i = 1; i <= 5; i++) {
        int M = max({nums[i], nums[i+1], nums[i+2], nums[i+3], nums[i+4]});
        int m = min({nums[i], nums[i+1], nums[i+2], nums[i+3], nums[i+4]});
        if (M == m && m != 0) {
            if (colorsame) { // 스트레이트 플러시
                cout << 900 + i + 4;
            } else cout << 500 + i + 4; // 스트레이트
            return 0;
        }
    }

    int threes = -1, twos = -1, high = 0;
    for (int i = 1; i < 10; i++) {
        if (nums[i] > 0) high = i;
        if (nums[i] == 4) { // 포카드
            cout << i + 800;
            return 0;
        }
        if (nums[i] == 3) // 트리플 혹은 풀하우스
            threes = i;
        if (nums[i] == 2) {
            if (twos == -1) // 아직 페어인지 투페어인지 모름
                twos = i;
            else { // 이미 페어 있었음, 투페어
                cout << max(twos, i) * 10 + min(twos, i) + 300;
                return 0;
            }
        }
    }

    if (colorsame) { // 플러시
        cout << high + 600;
    } else if (threes != -1 && twos != -1) { // 풀하우스
        cout << threes * 10 + twos + 700;
    } else if (threes != -1) { // 트리플
        cout << threes + 400;
    } else if (twos != -1) { // 페어
        cout << twos + 200;
    } else cout << high + 100;
    
    return 0;
}