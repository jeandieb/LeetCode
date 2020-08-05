#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int maxProfit(vector<int>& prices)
{
	if (prices.empty()) return 0;
	int maxProfit = 0, temp = prices[0];
	for (int i = 1; i < prices.size(); i++)
	{
		temp = min(temp, prices[i]);
		maxProfit = max(maxProfit, prices[i] - temp);
	}

	return maxProfit;
}


int main()
{
	vector<int> PRI = { 2,3,8,6,4,9,7,2,0,6 };
	cout << "the maximum profit is: " << maxProfit(PRI) << endl;
}
