/*Diego De Los Santos, 
Dominga Lapurkaite, 
Staje Kankati, Tom Casalino, 
Miles Britt(Wade)*/
#include <iostream>
#include <iomanip> 
#include <cmath>
#include "MortgagePayment.h"

using namespace std;

int main()
{
	MortgagePayment myl; 

	char choice;
	double l, r;
	int y;
	
	do {
		cout << "Enter loan amount: ";
		cin >> l;
		cout << "Enter interest rate: ";
		cin >> r;
		cout << "Enter number of years: ";
		cin >> y;
		myl.setLoanAmount(l);
		myl.setInterestRate(r);
		myl.setNumYears(y);

		cout << setprecision(2) << fixed << showpoint;
		cout << "\n\nThe monthly payment amount = " << myl.getMonthlyPayment() << "\nTotal amount paid = " << myl.getTotalAmount() << endl;

		cout << "Do you want to continue (Y/N) : ";
		cin >> choice;
	} while (tolower(choice) != 'n');

	return 0;
}