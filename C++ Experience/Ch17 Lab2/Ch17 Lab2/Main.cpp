#include <iostream>
#include "ListClass.h"

using namespace std;

int main()
{
	ListClass list;

	// Append some values to the list.
	cout << "Here are nodes after Append function" << endl;
	list.appendNode(2.5);
	list.appendNode(7.9);
	list.appendNode(12.6);
	list.displaylist();

	//Insert Node 
	cout << "Here are the nodes after the insert function" << endl;
	list.insertNode(3.2);
	list.displaylist();

	//Delete Node
	cout << "Here are the nodes after deleting one" << endl;
	list.deleteNode(12.6);
	list.displaylist();

	//display list
	cout << "Here are nodes the left" << endl;
	list.displaylist();

	//Decontructiong the Linked list
	list.~ListClass();
	return 0;
}