#include <iostream>
#include "ListClass.h"

using namespace std;

void ListClass::appendNode(double num)
{
	ListNode *newNode;
	ListNode *nodePtr;// To traverse the list

	newNode = new ListNode;
	newNode->data = num;
	newNode->next = NULL;


	if (!head)//If no head in list.
		head = newNode;//Make newNode the head
	else
	{
		nodePtr = head;
		while (nodePtr->next)
		{
			nodePtr = nodePtr->next;
		}

		nodePtr->next = newNode;
	}

}

void ListClass::insertNode(double num)
{
	ListNode *newNode;
	ListNode *nodePtr;
	ListNode *PreviousNode = NULL;

	newNode = new ListNode;
	newNode->data = num;

	if (!head)
	{
		head = newNode;
		newNode->next = NULL;
	}
	else
	{
		nodePtr = head;
		PreviousNode = NULL;
		while (nodePtr != NULL && nodePtr->data < num)
		{
			PreviousNode = nodePtr;
			nodePtr = nodePtr->next;
		}
		if (PreviousNode == NULL)
		{
			head = newNode;
			newNode->next = nodePtr;
		}
		else
		{
			PreviousNode->next = newNode;
			newNode->next = nodePtr;
		}
	}
}

void ListClass::deleteNode(double num)
{
	ListNode *nodePtr;
	ListNode *previousNode;

	// If the list is empty, do nothing.
	if (!head)
		return;
	if (head->data == num)
	{
		nodePtr = head->next;
		delete head;
		head = nodePtr;
	}
	else
	{
		nodePtr = head;

		// Skip all nodes whose value member is not equal to num.
		while (nodePtr != nullptr && nodePtr->data != num)
		{
			previousNode = nodePtr;
			nodePtr = nodePtr->next;
		}

		// If nodePtr is not at the end of the list, link the previous node to the node after nodePtr, then delete nodePtr.
		if (nodePtr)
		{
			previousNode->next = nodePtr->next;
			delete nodePtr;
		}
	}
}

ListClass::~ListClass()
{
	ListNode *nodePtr;
	ListNode *nextNode;

	// Position nodePtr at the head of the list.
	nodePtr = head;

	// While nodePtr is not at the end of the list...
	while (nodePtr != nullptr)
	{
		// Save a pointer to the next node.
		nextNode = nodePtr->next;

		// Delete the current node.
		delete nodePtr;

		// Position nodePtr at the next node.
		nodePtr = nextNode;
	}
}

void ListClass::displaylist()
{
	ListNode *nodePtr;

	// Position nodePtr at the head of the list.
	nodePtr = head;

	// While nodePtr points to a node, traverse the list.
	while (nodePtr)
	{
		// Display the value in this node.
		cout << nodePtr->data << endl;

		// Move to the next node.
		nodePtr = nodePtr->next;
	}
}