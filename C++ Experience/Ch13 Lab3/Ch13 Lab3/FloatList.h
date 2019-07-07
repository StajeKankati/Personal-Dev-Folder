// This program reads floating point data from a data file and places those
// values into the private data member called values (a floating point array)
// of the FloatList class. Those values are then printed to the screen.
// The input is done by a member function called GetList. The output
// is done by a member function called PrintList. The amount of data read in
// is stored in the private data member called length. The member function
// GetList is called first so that length can be initialized to zero.
#include <iostream>
#include <fstream>
#include <iomanip> 

using namespace std;

const int MAX_LENGTH = 50; // MAX_LENGTH contains the maximum length of our list

class FloatList // Declares a class that contains an array of floating point numbers
{
public:
	void getList(ifstream&); // Member function that gets data from a file
	void printList() const; // Member function that prints data from that file to the screen.
	FloatList(); // constructor that sets length to 0.
	~FloatList(); // destructor
private:
	int length; // Holds the number of elements in the array
	float values[MAX_LENGTH]; // The array of values
};
