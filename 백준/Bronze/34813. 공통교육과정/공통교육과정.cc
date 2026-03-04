// 공통교육과정
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

string input;

int main(void) {
    fastio();
    cin >> input;

    if (input[0] == 'F') cout << "Foundation";
    else if (input[0] == 'C') cout << "Claves";
    else if (input[0] == 'V') cout << "Veritas";
    else cout << "Exploration";

    return 0;
}