#include <iostream>
#include <fstream>
#include <iomanip> 
#include "FloatList.h"

using namespace std;

int main()
{
	ifstream tempData; // Defines a data file
	// Fill in the code to define an object called list of the class FloatList
	FloatList *list = new FloatList();
	cout << fixed << showpoint;
	cout << setprecision(2);
	tempData.open("temperatures.txt");
	// Fill in the code that calls the getList function.
	list->getList();
	// Fill in the code that calls the printList function.
	list->printList();
	return 0;
}