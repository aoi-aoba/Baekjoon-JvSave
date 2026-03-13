// 등급 계산하기
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
vector<int> grade = {0, 4, 11, 23, 40, 60, 77, 89, 96, 100, 101};
vector<int> res(9, 0);

int main(void) {
    fastio();
    cin >> n;

    vector<int> points(n);
    for (int i = 0; i < n; i++)
        cin >> points[i];
    
    sort(points.begin(), points.end(), greater<int>());

    vector<int> set_point = points;
    set_point.erase(unique(set_point.begin(), set_point.end()), set_point.end());

    int tot = 0, tmp = 0, idx = 0;
    for (int p : set_point) {
        int cnt = count(points.begin(), points.end(), p);
        tmp += cnt, tot += cnt;
        if (grade[idx + 1] <= tot) {
            res[idx] += tmp, tmp = 0;
            while (grade[idx + 1] <= tot) idx++;
        }
    }

    for (int e : res) cout << e << '\n';
    return 0;
}