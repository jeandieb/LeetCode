#include <iostream>
#include <vector>
using namespace std;


int removeDuplicates(vector<int>& nums)
{
    if (nums.empty())
    {

    }
    else
    {
        for (int i = 0; i < nums.size() - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                nums.erase(nums.begin() + i + 1);
                i--;
            }
        }
    }
    return nums.size();
}



int main()
{
    vector<int> test{0,0,1,1,1,2,2,3,3,4};
    removeDuplicates(test);
    for (int x : test)
    {
        cout << x << endl;
    }
}
