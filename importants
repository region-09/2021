https://cses.fi/problemset/task/1619


#include <bits/stdc++.h>

using namespace std;

int main() {

    int n; cin >> n;
    vector<pair<int, int>> vals;
    for (int i = 0; i < n; i++) {
        int l, r;
        cin >> l >> r;
        vals.push_back(make_pair(l, 1));
        vals.push_back(make_pair(r, -1));
    }
    sort(vals.begin(), vals.end());

    int sum = 0;
    int ans = 0;
    for (auto x : vals) {
        sum += x.second;
        ans = max(ans, sum);
        cout << x.second << endl;
    }
    cout << ans << '\n';
    return 0;
}
