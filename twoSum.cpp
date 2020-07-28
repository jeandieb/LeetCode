#include <iostream>
#include <vector>

using namespace std; 

vector<int> twoSum(vector<int>& nums, int target)
{
	vector <int> returned;
	for (int i = 0; i < nums.size(); i++)
	{
		if (!returned.empty())
			break;
		for (int j = 0; j < nums.size(); j++)
		{
			if (i != j && nums[j] + nums[i] == target)
			{
				returned.push_back(i);
				returned.push_back(j);

			}
		}
	}
	return returned;
}

int main()
{
	vector <int> numbers = { 3,3};
	int targetIs = 6;
	vector<int>answer = twoSum(numbers, targetIs);
	cout << "the indecies of the elements that add up to " << targetIs << " is:";
	for (int j = 0; j < answer.size(); j++)
	{
		cout << answer[j] << ", ";
	}

}


