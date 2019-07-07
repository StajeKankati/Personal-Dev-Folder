#include "stdafx.h"
#include <iostream>
#include <string>

using namespace std;

class ProductionWorker :public employee
{
private: int Shift;
		 double HourlyPay;

public: ProductionWorker()
	{
	Shift = 0;
	HourlyPay = 0;
	}
		ProductionWorker(int sh, double pay)
		{
			Shift = sh;
			HourlyPay = pay;
		}
		class InvalidShift {};
		class InvalidPayRate {};
		void setShift(int);
		void setHourlyPay(double);
		int getShift();
		double getHourlyPay();
};

void ProductionWorker::setShift(int sh)
{
	if (sh < 0 || sh > 2)
	{
		throw InvalidShift();
	}
	else
	{
		Shift = sh;
	}
}

void ProductionWorker::setHourlyPay(double pay)
{
	if (pay < 1)
		throw InvalidPayRate();
	else
		HourlyPay = pay;
}
int ProductionWorker::getShift()
{
	return Shift;
}

double ProductionWorker::getHourlyPay()
{
	return HourlyPay;
}
