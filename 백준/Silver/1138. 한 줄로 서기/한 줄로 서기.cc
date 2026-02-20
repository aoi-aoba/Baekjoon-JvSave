// 한 줄로 서기

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
int arr[11];

int main(void) {
    fastio();
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int temp = 0;
        cin >> temp;

        int idx = 0, cnt = 0, p = 0;
        while (cnt != temp) {
            if (arr[p] == 0) {
                idx++; cnt++; p++;
            } else {
                idx++; p++;
            }
        }
        
        while (arr[idx] != 0)
            idx++;
        arr[idx] = i + 1;
    }

    for (int i = 0; i < n; i++)
        cout << arr[i] << ' ';
    cout << '\n';

    return 0;
}