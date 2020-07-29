#include <iostream>

using namespace std; 

int reverse(int x)
{
	int returned = 0;
	while (x != 0)
	{
		int remainder = x % 10;
		x /= 10;
		if (returned > INT_MAX / 10 || (returned == INT_MAX / 10 && remainder > 7)) return 0;

		if (returned < INT_MIN / 10 || (returned == INT_MIN / 10 && remainder < -8)) return 0;

		returned = (returned * 10) + remainder;

	}
	return returned;
}


int main()
{
	int x = 123;
	cout << "The inverse of the integer " << x << " is: " << reverse(x) << endl;
	int y = 1534236469;
	cout << "The inverse of the integer " << y << " is: " << reverse(y) << endl;
}


