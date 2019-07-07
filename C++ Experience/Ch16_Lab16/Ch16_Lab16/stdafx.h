#include <iostream>
#include <string>

using namespace std;

class employee
{
private: string empName;
		 int empNumber;
		 string Hiredate;
public: employee()
{
	empName = "";
	empNumber = 0;
	Hiredate = "";
}

		employee(string name, int number, string date)
		{
			empName = name;
			empNumber = 0;
			Hiredate = "";
		}
		class InvalidemployeeNumber
		{

		};
		void setempName(string);
		void setempNumber(int);
		void setHiredate(string);
		string getempName();
		int getempNumber();
		string getHiredate();

};

void employee::setempName(string str)
{
	empName = str;
}
void employee::setempNumber(int num)
{
	if (num < 0 || num >9999)
		throw InvalidemployeeNumber();
	else
		empNumber = num;

}

void employee::setHiredate(string date)
{
	Hiredate = date;
}
string employee::getempName()
{
	return empName;
}
int employee::getempNumber()
{
	return empNumber;
}
string employee::getHiredate()
{
	return Hiredate;
}

