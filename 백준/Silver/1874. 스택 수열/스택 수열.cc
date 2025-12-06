#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, temp, now = 1;
bool flag = true;
stack<int> st;
string s;

int main(void) {
    fastio();
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        while (now <= temp) {
            st.push(now);
            s.append("+\n");
            now += 1;
        }
        if (st.top() == temp) {
            st.pop();
            s.append("-\n");
        } else flag = false;
    }
    if (!flag) cout << "NO";
    else cout << s;
    return 0;
}