#include <iostream>
#include <stack>

using namespace std;

bool isValid(string s)
{
	stack<char> temp;

	for (int i = 0; i < s.size(); i++)
	{
		if (s[i] == '{' || s[i] == '[' || s[i] == '(')
		{
			temp.push(s[i]);
		}
		if (s[i] == ']')
		{
			if (temp.empty())
				return false;
			if (temp.top() == '[')
				temp.pop();
			else return false;
		}
		if (s[i] == ')')
		{
			if (temp.empty())
				return false;
			if (temp.top() == '(')
				temp.pop();
			else return false;
		}
		if (s[i] == '}')
		{
			if (temp.empty())
				return false;
			if (temp.top() == '{')
				temp.pop();
			else return false;
		}
	}
	if (temp.empty())
		return true;
	else return false;
}

int main()
{
	string name = "{}()[]";
	string name2 = "{([])}";
	string name3 = ")";
	cout << isValid(name3);
}
