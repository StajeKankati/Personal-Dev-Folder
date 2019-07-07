#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

class MortgagePayment
{
private:
	double LoanAmount, InterestRate;
	int NumYears;
public:
	MortgagePayment();
	void setLoanAmount(double);
	void setInterestRate(double);
	void setNumYears(int);

	double getMonthlyPayment();
	double getTotalAmount();
};
