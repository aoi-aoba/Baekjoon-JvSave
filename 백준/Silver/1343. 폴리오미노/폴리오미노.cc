// 폴리오미노
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

string input, output;

int main(void) {
    fastio();
    cin >> input;

    int xs = 0;
    for (int i = 0; i < input.size(); i++) {
        if (input[i] == 'X') {
            xs++;
        } else if (input[i - 1] == 'X') {
            if (xs % 2 != 0) {
                cout << -1;
                return 0;
            }
            
            int as = xs / 4, bs = xs % 4;
            for (int j = 0; j < as * 4; j++) output += 'A';
            for (int j = 0; j < bs; j++) output += 'B';
            
            output += '.';
            xs = 0;
        } else output +=  '.';
    }

    if (xs != 0) {
        if (xs % 2 != 0) {
            cout << -1;
            return 0;
        }
        else {
            int as = xs / 4, bs = xs % 4;
            for (int j = 0; j < as * 4; j++) output += 'A';
            for (int j = 0; j < bs; j++) output += 'B';
        }
    }

    cout << output;

    return 0;
}