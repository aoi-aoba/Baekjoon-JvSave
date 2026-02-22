// 2023 아주머학교 프로그래딩 정시머힌

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
string k = "@[!;^07", v = "acijnot";

string go(string s) {
    int c = 0, i = 0;
    string r;
    for (; i < s.size();) {
        // w와 v를 먼저 처리해서 우선순위가 안 꼬이게 하고
        if (i + 2 < s.size() && s[i] == '\\' && s[i+1] == '\\' && s[i+2] == '\'')
            r += 'w', c++, i += 3;
        else if (i + 1 < s.size() && s[i] == '\\' && s[i+1] == '\'')
            r += 'v', c++, i += 2;
        // w나 v가 아니면 특수문자집합 k에서 찾아보고 없으면 그대로 적용, 있으면 바구기
        else {
            auto p = k.find(s[i]);
            if (p < k.size()) r += v[p], c++;
            else r += s[i];
            i++;
        }
    }
    return c * 2 >= r.size() ? "I don't understand\n" : r + "\n";
}

int main(void) {
    fastio();
    
    cin >> n;
    while (n--) {
        string s;
        cin >> s;
        cout << go(s);
    }

    return 0;
}