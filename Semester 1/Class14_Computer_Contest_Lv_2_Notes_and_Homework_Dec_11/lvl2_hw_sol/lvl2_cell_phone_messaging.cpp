#include <iostream>
#include <string>
using namespace std;

int main()
{
	char key[8][6] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	string input;
	int pre_row=-1, time=0;
	while (cin >> input && input!="halt")
	{
		pre_row = -1;  time = 0;
		for (int i=0; i<input.size(); i++)
		{
			for (int row=0; row<8; row++)
			{
				for (int col=0; key[row][col]; col++)
				{
					if (input[i] == key[row][col])
					{
						if (row == pre_row)
							time += 2;
						time += col+1;
						pre_row = row;
					}
				}
			}
		}
		cout << time << endl;
	}
    return 0;
}