//Diego Delo Santos
//Domuinga Lupurkaite
//Staje Kankati
#include <iostream>
#include <string>
#include "Ship.h"

using namespace std;


int main()
{
	int i;
	Ship *ships[3] = { new Ship("SSDominga", "1715"),
		new CruiseShip("SSStaje","1716",2000),
		new CargoShip("SSDiego","1717",4000)
	};

	for (i = 0; i < 3; i++)
	{
		ships[i]->print();
	}

	system("pause");

	return 0;
}