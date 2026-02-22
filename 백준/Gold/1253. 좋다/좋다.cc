// 좋다

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, ans = 0, arr[2000];

int main(void) {
    fastio();
    
    cin >> n;
    for (int i = 0; i < n; i++) cin >> arr[i];
	sort(arr, arr + n);

    for (int i = 0; i < n; i++) {
        int cur = arr[i];
        int st = (i == 0) ? 1 : 0;
        int en = (i == n - 1) ? n - 2 : n - 1;

        while (st != en) {
            if (arr[st] + arr[en] > cur) {
                en--;
                if (en == i) en--;
            } else if (arr[st] + arr[en] < cur) {
                st++;
                if (st == i) st++;
            } else {
                ans++;
                break;
            }
        }
    }
    
    cout << ans;
    return 0;
}