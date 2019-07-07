//Staje Kankati

#include<iostream>
#include<string>
#include"Header.h"

using namespace std;

int main()
{
	StudentTestScores student1("staje kankati", 3);
	student1.setTestScore(100.0, 0);
	student1.setTestScore(95.0, 1);
	student1.setTestScore(80.0, 2);


	StudentTestScores student2 = student1;


}