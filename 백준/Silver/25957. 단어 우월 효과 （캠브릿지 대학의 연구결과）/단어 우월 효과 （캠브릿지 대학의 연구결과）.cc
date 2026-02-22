// 단어 우월 효과 (캠브릿지 대학의 연구결과)

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, m;
string s, t, v;
unordered_map<string,string> a;

int main(void) {
    fastio();
    cin >> n;
    while (n--) {
        cin >> s;
        v = s;
        // 2글자보다 작으면 자기 자신을 key로, 아니면 시작-끝(중간문자정렬) 형태로 단어 구분
        t = s.size() < 2 ? s : (string() + s[0] + '-' + s.back() + (sort(s.begin() + 1, s.end() - 1), s.substr(1, s.size() - 2)));
        a[t] = v;
    }
    cin >> m;
    while (m--) {
        cin >> s;
        t = s.size() < 2 ? s : (string() + s[0] + '-' + s.back() + (sort(s.begin() + 1, s.end() - 1), s.substr(1, s.size() - 2)));
        cout << a[t] << " ";
    }
}