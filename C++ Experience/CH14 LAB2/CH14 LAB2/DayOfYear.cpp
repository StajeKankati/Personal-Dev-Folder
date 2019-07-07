#include <iostream>
#include <string>
using namespace std;
#include "DayOfYear.h"

const string DayOfYear::MonthN[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
const int DayOfYear::LastDayOfM[] = { 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };

DayOfYear::DayOfYear(int dayOfYear)
	:dayOfYear(dayOfYear)
{
	if (this->dayOfYear < 1 || this->dayOfYear > 365)
	{
		this->dayOfYear = 0;
	}
}

ostream &operator<<(ostream &strm, const DayOfYear &rhs)
{
	strm << "dayOfYear: " << rhs.dayOfYear;
	return strm;
}

int DayOfYear::dayOfMonth(int month) const
{
	return month > 0 ? dayOfYear - LastDayOfM[month - 1] : dayOfYear;
}

void DayOfYear::print() const
{
	if (dayOfYear == 0)
	{
		cerr << "Not a day of the year." << endl;
	}
	else
	{
		int month = 0;
		while (dayOfYear > LastDayOfM[month])
		{
			++month;
		}
		cout << MonthN[month] << " " << dayOfMonth(month)
			<< endl;
	}
}