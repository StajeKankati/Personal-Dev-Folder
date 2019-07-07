//Staje Kankati
//Diego De Los Santos

#include <iostream>
#include <string>
using namespace std;
//#ifndef DAYOFYEAR_H
//#define DAYOFYEAR_H

class DayOfYear
{
private:
	static const string MonthN[];
	static const int LastDayOfM[];
	int dayOfYear;
	int dayOfMonth(int month) const;

public:
	friend ostream &operator<<(ostream &strm, const DayOfYear &rhs);
	DayOfYear() :dayOfYear(0) {};
	DayOfYear(int dayOfYear);
	~DayOfYear() {};
	void print() const;
};
