#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int count_diff(string a, string b, int startPos) {
    int cnt = 0;
    for (int i = 0; i < a.size(); i++)
        if (a[i] != b[i + startPos]) cnt++;
    return cnt;
}

int main(void) {
    fastio();

    string sa, sb;
    cin >> sa >> sb;

    // 길이가 서로 같다면 차이만큼이 답
    if (sa.size() == sb.size())
        cout << count_diff(sa, sb, 0);
    
    // 길이가 다르다면 비교를 다른 위치에서 진행해봐야 함
    else {
        int minDiff = sa.size();
        for (int pos = 0; pos <= sb.size() - sa.size(); pos++)
            minDiff = min(minDiff, count_diff(sa, sb, pos));
        cout << minDiff;
    }

    return 0;
}