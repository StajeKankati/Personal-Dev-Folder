#include <string>
#include <iostream>
using namespace std;

class Employee
{
private: string empName;
		 int empNum;
		 string hireDate;
public:
	Employee() :empName(""), empNum(0), hireDate("") 
	{}

	Employee(string name, int num, string date)
	{
		empName = name;
		empNum = num;
		hireDate = date;
	}

	void setempName(string n);
	void setempNum(int nm);
	void setHiredate(string d);
	string getName();
	int getNum();
	string getDate();
	void print();
};

void Employee::setempName(string n)
{
	empName = n;
}

void Employee::setempNum(int nm)
{
	empNum = nm;
}

void Employee::setHiredate(string d)
{
	hireDate = d;
}

string Employee::getName()
{
	return empName;
}

int Employee::getNum()
{
	//InvalidEmpNumber
	if (empNum < 0 || empNum > 9999)
	{
		cout << "Invalid employee number" << endl;
	}
	return empNum;
}

string Employee::getDate()
{
	return hireDate;
}

class ProductionWorker : public Employee
{
private:
	int shift;
	double hrlyPay;
public:
	ProductionWorker() :shift(0), hrlyPay(0.0)
	{}

	ProductionWorker(int sh, double pay)
	{
		shift = sh;
		hrlyPay = pay;
	}

	void setshift(int s);
	void setPay(double p);
	int getshift();
	double getPay();
	void print();
};

void ProductionWorker::print()
{
	cout << "Employee Name: " << getName() << endl;
	cout << "Employee Number: " << getNum() << endl;
	cout << "Hire Date: " << getDate() << endl;
	cout << "Shift: " << getshift();

	
	
	if (shift == 1)
	{
		cout << "(Day Shift)" << endl;
	}
	
	//InvalidShift
	else if (shift >= 0)
	{
		cout << "This is an invalid shift" << endl;
	}
	
	else
		cout << "(Night Shift)" << endl;

	cout << "Pay Rate: $" << getPay() << endl;
}

void ProductionWorker::setshift(int sh)
{
	sh = shift;
}

void ProductionWorker::setPay(double p)
{
	p = hrlyPay;
	//Invalid pay rate
	if (hrlyPay < 0)
	{
		cout << "This is an invalid pay rate" << endl;
	}
}

int ProductionWorker::getshift()
{
	return shift;
}

double ProductionWorker::getPay()
{
	return hrlyPay;
}

int main()
{
	int Shift;
	double pay;
	cout << "Enter 1 for Day Shift or 2 for Night Shift: " << endl;
	cout << "Any deviation will default to Night Shift ";
	cin >> Shift;
	cout << "Enter hourly pay: $";
	cin >> pay;
	ProductionWorker emp1(Shift, pay);
	emp1.setempName("Pedro, Colon");
	emp1.setempNum(8675309);
	emp1.setHiredate("1-1-2000");
	emp1.print();
	return 0;
}