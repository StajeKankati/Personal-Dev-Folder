
#ifndef TestScores_H
#define TestScores_H

void testAvg(int len, int marks[]);  

class TestScores  
	
{
private:
	
		int _len;                     
	
		int* _marks[];                

public:
		
		TestScores()
		
		{
		
		_len = 0;
		
		_marks = 0;
		
		}
		

		
		TestScores(int len, int marks[])
		
	{
		
			_len = len;
		
			* _marks = marks;
		
	}
	

		
		
		int getAvg()
		
	{
		
			int i, j, sum = 0, currMark;
		
			char error[60];
		

			
		if (_len < 1)
			
			return 0;
		

			
		for (i = 0; i<_len; i++)
			
		{
			
				currMark = (*_marks)[i];
			
				
			if (currMark < 0)
				
			{
				
					throw "ERROR:  Grade can not be negative";
				
			}
			
				
			if (currMark > 100)
				
			{
				
					throw "ERROR:  Grade can not exceed 100 points";
				
			}
			
				sum += currMark;
			
		}
		

			
			return (sum) / _len;
		
	}
	
};
