#include <iostream>
#include <fstream>
using namespace std;

template <class T>
T total(int num, string filename)
{
	T numbers;
	T total;
	T count = 0;

	ifstream inputFile(filename);
	

	while ((count++ < num) && (inputFile >> numbers))
		total += numbers;


	if (count == num)
		return total;

	else
	{
		cout << "Error opening file.";
	}

}

int main()
{
	int choice = 0;
	cout << "Choose the number of the file type you want to total:" << endl << "1. Integers\n2. Doubles\n3. Strings\n" << endl;
	cin >> choice;

	
	if (choice == 1)
	{
		cout << "How many lines of data would you like to total?";
		int n = 0;
		cin >> n;
		total(n, "integers.txt");
	}

	if (choice == 2)
	{
		cout << "How many lines of data would you like to total?";
		double n = 0.0;
		cin >> n;
		total(n, "doubles.txt");
	}

	
	if (choice == 3)
	
	{
		cout << "How many lines of data would you like to total?";
		int n;
		cin >> n;
		total(n, "not_numbers.txt");

	}
	if (choice < 1 || choice > 3) 
	{
		cout << "Invalid choice. Enter integers, doubles or strings." << endl;
		cout << "Choose the file type you want to total: integers, doubles, or strings.";
		cin >> choice;
	}

	return 0;
}