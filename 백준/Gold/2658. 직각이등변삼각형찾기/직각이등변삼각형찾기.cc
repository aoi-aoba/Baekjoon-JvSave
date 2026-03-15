// 직각이등변삼각형찾기
#include <bits/stdc++.h>
#define fastio ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
using namespace std;
using pii = pair<int, int>;
 
int n = 10;
int brd[11][11], cmpbrd[11][11];
 
bool isValid(int x, int y) {
	return 0 <= x && x < n && 0 <= y && y < n;
}
 
bool chk() {
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if (brd[i][j] != cmpbrd[i][j]) return false;
		}
	}
	return true;
}
 
bool triangle0(int x, int y, int l) {
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < i + 1; j++) {
			int nx = i + x, ny = j + y;
			if (!isValid(nx, ny)) return false;
			cmpbrd[nx][ny] = 1;
		}
	}
 
	return true;
}
 
bool triangle1(int x, int y, int l) {
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < l - i; j++) {
			int nx = i + x, ny = j + y;
			if (!isValid(nx, ny)) return false;
			cmpbrd[nx][ny] = 1;
		}
	}
 
	return true;
}
 
bool triangle2(int x, int y, int l) {
	for (int i = 0; i < l; i++) {
		for (int j = 0; j > i - l; j--) {
			int nx = i + x, ny = j + y;
			if (!isValid(nx, ny)) return false;
			cmpbrd[nx][ny] = 1;
		}
	}
 
	return true;
}
 
bool triangle3(int x, int y, int l) {
	for (int i = 0; i < l; i++) {
		for (int j = 0; j > -(i + 1); j--) {
			int nx = i + x, ny = j + y;
			if (!isValid(nx, ny)) return false;
			cmpbrd[nx][ny] = 1;
		}
	}
 
	return true;
}
 
bool triangle4(int x, int y, int l) {
	return l & 1 && triangle0(x - l / 2, y, l / 2 + 1) && triangle1(x, y, l / 2 + 1);
}
 
bool triangle5(int x, int y, int l) {
	return l & 1 && triangle1(x, y, l / 2 + 1) && triangle2(x, y, l / 2 + 1);
}
 
bool triangle6(int x, int y, int l) {
	return l & 1 && triangle3(x - l / 2, y, l / 2) && triangle2(x, y, l / 2 + 1);
}
 
bool triangle7(int x, int y, int l) {
	return l & 1 && triangle0(x, y, l / 2 + 1) && triangle3(x, y, l / 2 + 1);
}
 
bool (*triangle[10])(int, int, int) = {triangle0, triangle1, triangle2, triangle3, triangle4, triangle5, triangle6, triangle7};
 
vector<pii> getAns(int k, int x, int y, int l) {
	vector<pii> ans;
	if (k == 0) ans = {{x, y}, {x+l-1, y}, {x+l-1, y+l-1}};
	else if (k == 1) ans = {{x, y}, {x, y+l-1}, {x+l-1, y}};
	else if (k == 2) ans = {{x, y}, {x+l-1, y}, {x, y-(l-1)}};
	else if (k == 3) ans = {{x, y}, {x+l-1, y}, {x+l-1, y-(l-1)}};
	else if (k == 4) ans = {{x-l/2, y}, {x+l/2, y}, {x, y+l/2}};
	else if (k == 5) ans = {{x, y+l/2}, {x, y-l/2}, {x+l/2, y}};
	else if (k == 6) ans = {{x-l/2, y}, {x+l/2, y}, {x, y-l/2}};
	else if (k == 7) ans = {{x, y}, {x+l/2, y+l/2}, {x+l/2, y-l/2}};
	sort(ans.begin(), ans.end());
	return ans;
}
 
int main() {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf("%1d", &brd[i][j]);
		}
	}
 
	for (int k = 0; k < 8; k++) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 2; l < n + 1; l++) {
					memset(cmpbrd, 0, sizeof(cmpbrd));
					if (triangle[k](i, j, l) & chk()) {
						for (pii x: getAns(k, i+1, j+1, l)) {
							printf("%d %d\n", x.first, x.second);
						}
						return 0;
					}
				}
			}
		}
	}
 
	cout << 0;
}