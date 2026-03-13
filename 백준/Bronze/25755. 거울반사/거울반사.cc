// 거울반사
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

unordered_map<int, char> mapping = {
    {1, '1'}, {2, '5'}, {3, '?'}, {4, '?'}, {5, '2'},
    {6, '?'}, {7, '?'}, {8, '8'}, {9, '?'}
};

char w;
int n;

int main(void) {
    fastio();
    cin >> w >> n;
    vector<vector<int>> v(n, vector<int>(n));

    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> v[i][j];

    if (w == 'L' || w == 'R') {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--)
                cout << mapping[v[i][j]] << " ";
            cout << "\n";
        }
    } else for (int i = n - 1; i >= 0; i--) {
        for (int j = 0; j < n; j++)
            cout << mapping[v[i][j]] << " ";
        cout << "\n";
    }
    
    return 0;
}