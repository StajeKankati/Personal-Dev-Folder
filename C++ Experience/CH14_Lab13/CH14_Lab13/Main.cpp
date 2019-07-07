
//Staje Kankati, Diego De Lossantos, Dominga Lapurkaite

#include <iostream>
#include "RoomDimension.h"
#include "RoomCarpet.h"

using namespace std;

int main()
{
	double length;
	double width;
	double cost;

	cout << "Enter the length of the room: ";
	cin >> length;
	cout << "Enter the width of the room: ";
	cin >> width;

	FeetInches filength(length);
	FeetInches fiwidth(width);

	RoomDimension roomDimension(filength, fiwidth);

	cout << "Enter cost per square feet. ";
	cin >> cost;
	RoomCarpet rCarpet(roomDimension, cost);
	cout << "The total cost of the carpet is : " << rCarpet.totalCost() << " Dollars ";
	system("Pause ");
	return 0;
}