#include <iostream>
#include <iomanip>
#include <cmath>
#include "MortgagePayment.h"

using namespace std;

MortgagePayment::MortgagePayment()
{
	setLoanAmount(0);
	setInterestRate(0);
	setNumYears(0);
}

void MortgagePayment::setLoanAmount(double l)
{
	LoanAmount = l;
}

void MortgagePayment::setInterestRate(double r)
{
	InterestRate = r;
}

void MortgagePayment::setNumYears(int y)
{
	NumYears = y;
}

double MortgagePayment::getMonthlyPayment()
{
	double term = pow((1 + (InterestRate / 12)), (12 * NumYears));
	double payment = ((LoanAmount * ((InterestRate / 12) * term)) / (term - 1));
	return payment;
}

double MortgagePayment::getTotalAmount()
{
	return ((12 * NumYears) * getMonthlyPayment());
}