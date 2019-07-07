#include <iostream>
#include "TestScores.h"
using namespace std;

int main()
{

	int marks1[] = { 79, 89, 86, 100, 82, 94, 73 };

	testAvg(5, marks1);

	int marks2[] = { 40, -60, 70 };

	testAvg(3, marks2);

	int marks3[] = { 140, 30 };

	testAvg(2, marks3);

	system("PAUSE");

	return 0;

}

void testAvg(int len, int marks[])

{
	
		TestScores test(len, marks);
	

		
		int result = 0;
	
		try
	{
		
			result = test.getAvg();
		
			cout << "The average of the test are: " << result << endl;
		
	}
		catch (char * err)
		
	{
		
			cout << err << "\n";
		
	}
	
}
