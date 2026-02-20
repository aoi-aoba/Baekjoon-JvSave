#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

string s, res;
int freq[100], isodd;
char mid;

int main() {
    fastio();
	
	cin >> s;
	for (char a : s) freq[a]++; 
	
	for (int i = 'Z'; i >= 'A'; i--) {
		if (freq[i]) {
			if (freq[i] % 2 == 1) {
				mid = char(i);
				isodd++;
				freq[i]--;
			}
			
            if (isodd == 2) break;
			for (int j = 0; j < freq[i]; j += 2) {
				res = char(i) + res;
				res += char(i);
			}
		}
	}

	if (isodd == 2) cout << "I'm Sorry Hansoo" << '\n';
	else {
        if (mid) res.insert(res.begin() + res.size() / 2, mid);
	    cout << res << '\n';
    }

	return 0;
}