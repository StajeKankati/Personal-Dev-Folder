#include <iostream>
#include "DayOfYear.h"
using namespace std;

int main()
{
	int input = -1;

	cout << "This program translates an integer representing a day of the" << " year to a string consisting of the month followed by day of" << " the month." << endl << endl;

	while (input != 0)
	{
		cout << "Please enter a day of the year (between 1 and 365): ";
		cin >> input;
		cin.ignore();
		if (input != 0)
		{
			DayOfYear real(input);
			real.print();
			cout << endl;
		}
		else if (input == 0)
		{
			DayOfYear real(input);
			real.print();
			cout << endl;
		}
	}

	return 0;
}