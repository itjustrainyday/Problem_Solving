#include <iostream>
#include <algorithm>
#include <string>
#include <cctype>
using namespace std;
int main() {
	string s;
	cin >> s;
	for (int i = 0; i < s.length(); ++i) {
		if (isupper(s[i])) {
			s[i] = tolower(s[i]);
		}
		else {
			s[i] = toupper(s[i]);
		}
	}
	cout << s;
	return 0;
}