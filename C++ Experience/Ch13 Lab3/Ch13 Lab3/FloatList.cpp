#include <iostream>
#include <fstream>
#include <iomanip> 
#include "FloatList.h"

using namespace std;

FloatList::FloatList()
{
	// Fill in the code to complete this constructor that sets the private data member length to 0
	length = 0;
	
}
// Fill in the entire code for the getList function The getList function reads the data values from a data file
// into the values array of the class FloatList
void FloatList::getList(ifstream& tempData)
{
	double temps;
	tempData >> temps;
	while (length < MAX_LENGTH)
	{
		values[length] = temps;
		length++;
		tempData >> temps;
	}
}
// Fill in the entire code for the printList function
// The printList function prints to the screen the data in
// the values array of the class FloatList
// Fill in the code for the implementation of the destructor
