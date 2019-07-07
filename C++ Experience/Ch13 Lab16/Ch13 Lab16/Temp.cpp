#include <iostream>
#include "Temperature.h"
using namespace std;

void Temperature::setTemp(float t)
{
	temp = t;
}

bool Temperature::isEthylFreezing(float t)
{
	if (t <= -173)
	{
		cout << "Ethyl will freeze at " << t << " degrees" << endl;
		return true;
	}
}

bool Temperature::isEthylBoiling(float t)
{
	if (t >= 172)
	{
		cout << "Ethyl will boil at " << t << " degrees" << endl;
		return true;
	}
}

bool Temperature::isOxygenFreezing(float t)
{
	if (t <= -362)
	{
		cout << "Oxygen will freeze at " << t << " degrees" << endl;
		return true;
	}
}

bool Temperature::isOxygenBoiling(float t)
{
	if (t >= -306)
	{
		cout << "Oxygen will boil at " << t << " degrees" << endl;
		return true;
	}
}

bool Temperature::isWaterFreezing(float t)
{
	if (t <= 32)
	{
		cout << "Water will freeze at " << t << " degrees" << endl;
		return true;
	}
}

bool Temperature::isWaterBoiling(float t)
{
	if (t >= 212)
	{
		cout << "Water will boil at " << t << " degrees" << endl;
		return true;
	}
}

