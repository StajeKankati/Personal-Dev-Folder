//Diego De Los Santos, Dominga Lapurkaite, Staje Kankati, Tom Casalino
//Chapter 13 Lab 16`
#include <iostream>
#include "Temperature.h"

using namespace std;

int main()
{
	Temperature Temp;
	float getTemp;

	cout << "Enter temperature: " << endl;
	cin >> getTemp;

	Temp.setTemp(getTemp);
	Temp.isEthylFreezing(getTemp);
	Temp.isEthylBoiling(getTemp);
	Temp.isOxygenFreezing(getTemp);
	Temp.isOxygenBoiling(getTemp);
	Temp.isWaterFreezing(getTemp);
	Temp.isWaterBoiling(getTemp);

	return 0;
}