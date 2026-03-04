// 연대 다음 고대
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, yonsei, korea;
string input;

int main(void) {
    fastio();
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        cin >> input;
        if (input == "yonsei") yonsei = i;
        if (input == "korea") korea = i;
    }

    if (yonsei < korea) cout << "Yonsei Won!";
    else cout << "Yonsei Lost...";
    return 0;
}