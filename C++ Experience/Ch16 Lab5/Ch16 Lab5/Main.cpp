//Diego De Los Santos
//Staje Kankati
//Dominga Lapurkaite
#include <iostream>

using namespace std;

template <class T>
T Total(T n)
{
	T total = 0, num;
	int i = 0;
	cout << "Enter Values" << endl;
	while (i < n)
	{
		cin >> num;
		total = total + num;
		i++;
	}
	return total;
}

int main()
{
	int n;
	cout << "Enter number of values: ";
	cin >> n;
	cout << "Total of all values: " << Total(n) << endl;
	system("pause");
	return 0;
}