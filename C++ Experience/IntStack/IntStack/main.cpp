#include <iostream>
#include "Header.h"
using namespace std;

int main()
{
	int catchVar;
	IntStack stack(5);
	
	cout << "pushing 5/n";
	stack.push(5);
	cout << "pushing 10/n";
	stack.push(10);
	cout << "pushing 15/n";
	stack.push(15);
	cout << "pushing 20/n";
	stack.push(20);
	cout << "pushing 25/n";
	stack.push(25);

	cout << "Popping.../n";
	stack.pop(catchVar);
	cout << catchVar << endl;
	stack.pop(catchVar);
	cout << catchVar << endl;
	stack.pop(catchVar);
	cout << catchVar << endl;
	stack.pop(catchVar);
	cout << catchVar << endl;
	stack.pop(catchVar);
	cout << catchVar << endl;
	return 0;
}