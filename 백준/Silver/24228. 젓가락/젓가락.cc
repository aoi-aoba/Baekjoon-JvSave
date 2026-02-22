// 젓가락

#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

/* 모든 종류에 대하여 1개씩만 다 뽑으면 최악 (초반)
   -> 여기에서 하나를 뽑으면 어떻게든 한 쌍이 만들어짐 (중반 or 1쌍의 경우 최악 끝)
   -> 여기에서 이미 뽑은 그 종류를 계속 뽑아서 나머지 쌍을 만들면 최악 (후반)
   즉, (n+1)개 뽑고, (r-1)쌍 뽑으니까 (n+1)+2(r-1)=n+2r-1
*/

int main(void) {
    fastio();
    long long n, r;
    cin >> n >> r;
    cout << n + (2 * r) - 1;

    return 0;
}