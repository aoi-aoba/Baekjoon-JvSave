// 트리의 순회
#include <bits/stdc++.h>
#define fastio() ios::sync_with_stdio(0); cin.tie(0); cout.tie(0)
using namespace std;

int n, idx[100001], inorder[100001], postorder[100001];

void preorder(int si, int ei, int sp, int ep) {
    if (si > ei || sp > ep) return;
    int root = idx[postorder[ep]];
    int lsize = root - si, rsize = ei - root;
    cout << inorder[root] << ' ';
    preorder(si, root - 1, sp, sp + lsize - 1);
    preorder(root + 1, ei, sp + lsize, ep - 1);
}

int main(void) {
    fastio();
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> inorder[i];
        idx[inorder[i]] = i;
    }

    for (int i = 1; i <= n; i++)
        cin >> postorder[i];
    preorder(1, n, 1, n);
    return 0;
}