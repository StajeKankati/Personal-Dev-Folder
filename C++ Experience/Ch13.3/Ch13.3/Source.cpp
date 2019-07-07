// Staje Kankati
#include<iostream>
#include<fstream>
#include<iomanip>

using namespace std;
const int Max_LENGTH = 50;
class FloatList
{
public:
	void getList(ifstream&);
	void printList() const;

	FloatList();
	~FloatList();

private:
	int length;
	float values[Max_LENGTH];
};

int main()
{
	ifstream tempData;
	FloatList list;
		cout << fixed << showpoint;
		cout << setprecision(2);
		tempData.open("temperatures.txt");
		FloatList(getlist);
		FloatList(printList);
		return 0;


}
FloatList::FloatList()
