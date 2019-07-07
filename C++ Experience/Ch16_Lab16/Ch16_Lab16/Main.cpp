#include "stdafx.h"
#include "ProductionWorker.h"
#include <iostream>
#include <string>

using namespace std;

int main()
{
	int shift;
	double pay;

	cout << " 1-DayShift \n 2-Night" << endl;
	cout << "Enter Shift: ";
	cin >> shift;
	cout << "Enter Hourly Pay: ";
	cin >> pay;

	ProductionWorker emp1(0, 0);

	emp1.setempName("Oliver Queen");
	emp1.setHiredate("November: 28");
	try
	{
		emp1.setempNumber(123);
		emp1.setShift(shift);
		emp1.setHourlyPay(pay);
	}
	catch (employee::InvalidemployeeNumber)
	{
		cout << "Error invalid Employee number" << endl;
	}
	catch (ProductionWorker::InvalidShift)
	{
		cout << "Error invalid shift" << endl;
	}
	catch (ProductionWorker::InvalidPayRate)
	{
		cout << "Error invalid PayRate" << endl;
	}
	cout << "Employee Details: " << endl << endl;
	cout << "Employee Name: " << emp1.getempName() << endl;
	cout << "Employee Number: " << emp1.getempNumber() << endl;
	cout << "Employee Hire Date: " << emp1.getHiredate() << endl;
	cout << "Employee Shift: " << emp1.getShift() << endl;
	cout << "Employee HourlyPay: " << emp1.getHourlyPay() << endl;

	system("pause");
	return 0;
}