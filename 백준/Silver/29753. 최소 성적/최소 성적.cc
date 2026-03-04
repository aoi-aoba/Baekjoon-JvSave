// 최소 성적
#include <bits/stdc++.h>

#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, c, sum_s = 0, sum_c = 0;
double x;
string g;

int scores[9] = {0, 10, 15, 20, 25, 30, 35, 40, 45};
string grades[9] = {"F", "D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};

int main(void) {
    fastio();
    cin >> n >> x;
    int target = (int)(x * 100 + 0.5);

    for (int i = 0; i < n - 1; i++) {
        cin >> c >> g;
        for (int j = 0; j < 9; j++) {
            if (g == grades[j]) {
                sum_s += c * scores[j];
                break;
            }
        }
        sum_c += c;
    }

    int tar_c;
    cin >> tar_c;
    sum_c += tar_c;
    
    for (int i = 0; i < 9; i++) {
        int tot = sum_s + tar_c * scores[i];
        int avg100 = (tot * 10) / sum_c;

        if (avg100 > target) {
            cout << grades[i];
            return 0;
        }
    }

    cout << "impossible";
    return 0;
}