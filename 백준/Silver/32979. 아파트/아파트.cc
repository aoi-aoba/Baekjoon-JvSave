// 아파트
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0)
using namespace std;

int main() {
    fastio();

    int n, t;
    cin >> n >> t;
    vector<int> arr(2*n);
    for (int i = 0; i < 2*n; i++)
        cin >> arr[i];

    int cur = 0;
    while (t--) {
        int b;
        cin >> b;
        cur = (cur + b - 1) % (2*n);
        // b번째 원소는 b-1칸 뒤의 원소임
        cout << arr[cur] << " ";
    }
    return 0;
}