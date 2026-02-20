// 접두사

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n;
vector<string> strs;

bool compareStrSize(string str1, string str2) {
    return str1.size() < str2.size();
}

int main() {
    int N;
    cin >> N;
    cin.ignore();

    vector<string> strs(N);
    for (string &input : strs)
        getline(cin, input);
    sort(strs.begin(), strs.end(), compareStrSize);

    int answer = N;
    for (int i = 0; i < N; i++) {
        string prefix = strs[i];
        for (int j = i + 1; j < N; j++) {
            if (strs[j].find(prefix) == 0) {
                answer--;
                break;
            }
        }
    }
    
    cout << answer;
    return 0;
}