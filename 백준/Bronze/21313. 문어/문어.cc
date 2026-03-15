// 문어
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

using namespace std;

int n;

int main(void) {
    fastio;
    cin >> n;
    
    int a = n % 2 ? n - 1 : n;
    for (int i = 0; i < a; i++) {
        if (i % 2) cout << "2 ";
        else cout << "1 ";
    }
    if (n % 2) cout << "3";
    
    return 0;
}