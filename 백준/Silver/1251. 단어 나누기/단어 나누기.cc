#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

vector<string> words;

void wordbreak(string word) {
    int n = word.size();
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            string s1 = word.substr(0, i + 1);
            string s2 = word.substr(i + 1, j - i);
            string s3 = word.substr(j + 1);
            
            reverse(s1.begin(), s1.end());
            reverse(s2.begin(), s2.end());
            reverse(s3.begin(), s3.end());

            words.push_back(s1 + s2 + s3);
        }
    }
}

int main(void) {
    fastio();
    string word;
    cin >> word;

    wordbreak(word);
    sort(words.begin(), words.end());
    
    cout << words[0];
    return 0;
}