//Diego De Los Santos
//Staje Kankati 
//Dominga Lapurkaite
#ifndef LISTCLASS_H
#define LISTCLASS_H
class ListClass
{
private:
	struct ListNode
	{
		double data;
		struct ListNode *next;
	};
	ListNode *head;

public:

	ListClass()
	{
		head = nullptr;
	}

	void appendNode(double);
	void insertNode(double);
	void deleteNode(double);
	void displaylist();

	~ListClass();
};
#endif
