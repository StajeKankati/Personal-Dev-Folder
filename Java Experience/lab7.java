//Sreeteja Kankati
//LAB 7


import java.io.*;
import java.util.Scanner;
import static java.lang.System.exit;


public class lab7
{
	public static void main(String[]args) throws IOException

	{
		File myFile = new File ("Lab7grades.txt");
		Scanner inFile = new Scanner (myFile);
		PrintWriter outFile = new PrintWriter("Classinfo.txt");
		Scanner kb = new Scanner(System.in);

		int choice,numStudents,count,counterA1,counterB1,counterC1,counterD1,counterF1,counterA2,counterB2,counterC2,counterD2,counterF2;
		float exam1,exam2,examAverage1,examAverage2,classAverageExam1,classAverageExam2,studentAverage,maxExam1,minExam1,maxExam2,minExam2,sum,sum2,exam1Input,exam2Input,sumExam1,sumExam2,standardDeviation,standardDeviation2;
		String name,nameMinExam1,nameMaxExam1,nameMinExam2,nameMaxExam2,str,str1,nameInput;
		char lGrades,lGrades2;
//***********************************
// #1 Event controlled loop
//***********************************
do
{
	inFile= new Scanner (myFile);
		System.out.println("Please choose one of the following: \n ");

		System.out.println("1:Class Average(exam1,exam2)\n\n2:StudentAverage(All 25 Students)\n\n3:Standard Deviation(exam1,exam2)\n\n4:Letter Grades(All 25 Students)\n\n5:Minimum/Maximum(for each exam and the students who got them)\n\n6:Locate(given a student name,find the grades)\n\n7:Locate all students where the difference between exam1 and exam2>15%\n\n8:Histogram\n\n9:Update Data(enter name,new test scores)\n\n10:Quit\n\n");
		choice= kb.nextInt();

		switch(choice)
		{
			case 1: System.out.println("You chose Class Average: \n");
					inFile.nextLine();
					sum=0;
					sum2=0;
					count=1;
					while (count<=25)
				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);
					sum=sum+exam1;
					sum2=sum2+exam2;

					count++;

			    }
			    	examAverage1=sum/25;
			    	examAverage2=sum2/25;
					System.out.printf(" Class average in Exam1: %10.2f\n ",examAverage1);
					System.out.printf("Class average in Exam2: %10.2f\n ",examAverage2);

						   break;

			case 2: System.out.println("You chose Student Average: \n");
					inFile.nextLine();
					count=1;
					while (count<=25)
				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);
					studentAverage= (exam1+exam2)/2;
					System.out.printf(" The Student Average for this Student is :%10s\n%10.2f\n ",name,studentAverage);
					count++;


				}
							break;

			case 3: System.out.println("You chose Standard Deviation: \n");
					sumExam1=0;
					sumExam2=0;
					inFile.nextLine();
					count=1;

					while (count<=25)
				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);
					studentAverage= (exam1+exam2)/2;
					System.out.printf(" The Standard deviation is :%10s\n%10.2f\n ",name,studentAverage);
					sumExam1=sumExam1+exam1;
					sumExam2=sumExam2+exam2;
					count++;
					inFile.close();
					inFile=new Scanner(myFile);
				for(count=1;count<=25;count++)
				{
					sumExam1=sumExam1+(exam1-(studentAverage*studentAverage));
					standardDeviation=(float)Math.sqrt(sumExam1);
				}
					for(count=1;count<=25;count++)
				{
					sumExam2=sumExam2+(exam2-(studentAverage*studentAverage));
					standardDeviation2=(float)Math.sqrt(sumExam2);
				}
         }
				System.out.printf("%10.2f\n",standardDeviation);
				System.out.printf("%10.2f\n",standardDeviation2);


							break;

			case 4: System.out.println("You chose Letter Grades: \n");
				    count=1;
				    inFile.nextLine();
				    System.out.printf("%35s%10s%12s%11s\n","Exam1","Exam2","Exam1","Exam 2");
					while (count<=25)
			    {
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);

					studentAverage= (exam1+exam2)/2;


					if(exam1>=90)
					lGrades='A';
					else if(exam1>=80)
					lGrades='B';
					else if(exam1>=70)
					lGrades='C';
					else if(exam1>=65)
					lGrades='D';
					else
					lGrades='F';

					if(exam2>=90)
					lGrades2='A';
					else if(exam2>=80)
					lGrades2='B';
					else if(exam2>=70)
					lGrades2='C';
					else if(exam2>=65)
					lGrades2='D';
					else
					lGrades2='F';

					System.out.printf("%-25s%10.2f%10.2f%10c%10c\n",name,exam1,exam2,lGrades,lGrades2);
					count++;
				}
							break;

			case 5: System.out.println("You chose Minimum/Maximum: \n");
					count=1;
					inFile.nextLine();
					maxExam1=0;
					minExam1=9999;
					maxExam2=0;
					minExam2=9999;
					nameMinExam1="";
					nameMaxExam1="";
					nameMinExam2="";
					nameMaxExam2="";
				System.out.printf("%15s%17s%22s%20s\n","MinExam1","MaxExam1","MinExam2","MaxExam2");
				//****************************************************
				//  #2 Count controlled While loop
				//****************************************************

					while(count<=25)

				{
						str=inFile.nextLine();
						name= str.substring(0,25);
						name=name.trim();
						str1=str.substring(25,35).trim();
						exam1=Float.parseFloat(str1);
						str1=str.substring(35).trim();
					    exam2=Float.parseFloat(str1);
					   if(exam1<minExam1)
					   {
						   minExam1=exam1;
						   nameMinExam1=name;
					   }
					   if(exam1>maxExam1)
					   {
					   	   maxExam1=exam1;
					   	   nameMaxExam1=name;
					   }
					   if(exam2<minExam2)
					   {
					   	   minExam2=exam2;
					   	   nameMinExam2=name;
					   }
					   if(exam2>maxExam2)
					   {
					   	  maxExam2=exam2;
					   	  nameMaxExam2=name;
					   }
							count++;
			  }
				System.out.printf("%15.2f%15.2f%22.2f%20.2f\n",minExam1,maxExam1,minExam2,maxExam2);
			  	System.out.printf("%18s%20s%20s%25s\n",nameMinExam1, nameMaxExam1, nameMinExam2, nameMaxExam2);

							break;
			case 6: System.out.println("You chose Locate: \n");
					System.out.println("Enter a name which you would like to locate \n");
					kb.nextLine();
					nameInput=kb.nextLine();
					count=1;
					inFile.nextLine();
					name="";
					while(count<=25)

				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);
						count++;
					if(nameInput.equalsIgnoreCase(name))
					{
					System.out.printf("%35s%10s\n","exam1","exam2");
					System.out.printf("%-25s%10.2f%10.2f\n",name,exam1,exam2);
					}

				}
									break;

			case 7: System.out.println("You chose Locate Difference: \n");
			kb.nextLine();
			count=1;
			inFile.nextLine();
			System.out.printf("%35s%10s\n","exam1","exam2");
			while(count<=25)
				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
				    exam2=Float.parseFloat(str1);
				    	count++;
				    if(Math.abs(exam1-exam2)>15)
				    {
					System.out.printf("%-25s%10.2f%10.2f\n",name,exam1,exam2);
				    }
				}
							break;

			case 8: System.out.println("You chose Histogram: \n");
					counterA1=0;
					counterB1=0;
					counterC1=0;
					counterD1=0;
					counterF1=0;
					counterA2=0;
					counterB2=0;
					counterC2=0;
					counterD2=0;
					counterF2=0;
					inFile.nextLine();
					//*******************************
					//#3 for loop
					//*******************************
					for(count=1;count<=25;count++)
				{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);

				    	if(exam1>=90)
						counterA1++;
						else if(exam1>=80)
						counterB1++;
						else if(exam1>=70)
						counterC1++;
						else if(exam1>=65)
						counterD1++;
						else
						counterF1++;

						if(exam2>=90)
						counterA2++;
						else if(exam2>=80)
						counterB2++;
						else if(exam2>=70)
						counterC2++;
						else if(exam2>=65)
						counterD2++;
						else
						counterF2++;


					}
					System.out.println("            Exam1");
					System.out.printf("%10s%10d\n","A",counterA1);
					System.out.printf("%10s%10d\n","B",counterB1);
					System.out.printf("%10s%10d\n","C",counterC1);
					System.out.printf("%10s%10d\n","D",counterD1);
					System.out.printf("%10s%10d\n","F",counterF1);
					System.out.println("************************************************************");
					System.out.println("            Exam2");
					System.out.printf("%10s%10d\n","A",counterA2);
					System.out.printf("%10s%10d\n","B",counterB2);
					System.out.printf("%10s%10d\n","C",counterC2);
					System.out.printf("%10s%10d\n","D",counterD2);
					System.out.printf("%10s%10d\n","F",counterF2);
							break;

			case 9: System.out.println("You chose Update Data: \n");
					kb.nextLine();
					System.out.println("Enter the student name");
					nameInput=kb.nextLine();
					System.out.println("Enter new Exam1 grade for this student");
					exam1Input=kb.nextFloat();
					System.out.println("Enter a new exam2 grade for this student");
					exam2Input=kb.nextFloat();
					count=1;
					inFile.nextLine();
					System.out.printf("%35s%10s\n","exam1","exam2");
					while(count<=25)
					{
					str=inFile.nextLine();
					name= str.substring(0,25);
					name=name.trim();
					str1=str.substring(25,35).trim();
					exam1=Float.parseFloat(str1);
					str1=str.substring(35).trim();
					exam2=Float.parseFloat(str1);
				    	count++;
					if(nameInput.equalsIgnoreCase(name))
					{

					System.out.printf("%-25s%10.2f%10.2f\n",name,exam1Input,exam2Input);
					}
					else
					{

					System.out.printf("%-25s%10.2f%10.2f\n",name,exam1,exam2);
					}

				}			break;

			case 10: System.out.println("You chose Quit: ");

							break;
			//*************************************
			//    #4 Error Message
			//*************************************
			default: System.out.println("You chose an invalid choice. Please enter a valid choice");
							break;
		}
		inFile.close();
	}while(choice<10);
	}
}


/*Please choose one of the following:

1:Class Average(exam1,exam2)

2:StudentAverage(All 25 Students)

3:Standard Deviation(exam1,exam2)

4:Letter Grades(All 25 Students)

5:Minimum/Maximum(for each exam and the students who got them)

6:Locate(given a student name,find the grades)

7:Locate all students where the difference between exam1 and exam2>15%

8:Histogram

9:Update Data(enter name,new test scores)

10:Quit


1
You chose Class Average:

 Class average in Exam1:      72.94
 Class average in Exam2:      73.72
 Please choose one of the following:

1:Class Average(exam1,exam2)

2:StudentAverage(All 25 Students)

3:Standard Deviation(exam1,exam2)

4:Letter Grades(All 25 Students)

5:Minimum/Maximum(for each exam and the students who got them)

6:Locate(given a student name,find the grades)

7:Locate all students where the difference between exam1 and exam2>15%

8:Histogram

9:Update Data(enter name,new test scores)

10:Quit */


/*Please choose one of the following:

1:Class Average(exam1,exam2)

2:StudentAverage(All 25 Students)

3:Standard Deviation(exam1,exam2)

4:Letter Grades(All 25 Students)

5:Minimum/Maximum(for each exam and the students who got them)

6:Locate(given a student name,find the grades)

7:Locate all students where the difference between exam1 and exam2>15%

8:Histogram

9:Update Data(enter name,new test scores)

10:Quit


8
You chose Histogram:

            Exam1
         A         4
         B         2
         C         8
         D         4
         F         7
************************************************************
            Exam2
         A         6
         B         3
         C         4
         D         2
         F        10
Please choose one of the following:

1:Class Average(exam1,exam2)

2:StudentAverage(All 25 Students)

3:Standard Deviation(exam1,exam2)

4:Letter Grades(All 25 Students)

5:Minimum/Maximum(for each exam and the students who got them)

6:Locate(given a student name,find the grades)

7:Locate all students where the difference between exam1 and exam2>15%

8:Histogram

9:Update Data(enter name,new test scores)

10:Quit*/