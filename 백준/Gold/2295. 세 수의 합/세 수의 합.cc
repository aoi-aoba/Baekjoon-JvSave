// 세 수의 합
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

set<int> u;
int n, res;

int main(void) {
    fastio();
    cin >> n;
    int arr[n];

    for (int i = 0; i < n; i++) cin >> arr[i];
    sort(arr, arr + n);
    
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            u.insert(arr[i] + arr[j]);

    bool flag = true;
    for (int i = n - 1; i >= 0; i--) {
        for (int j = i - 1; j >= 0; j--) {
            if (u.find(arr[i] - arr[j]) != u.end()) {
                cout << arr[i];
                return 0;
            }
        }
        if (!flag) break;
    }

    return 0;
}