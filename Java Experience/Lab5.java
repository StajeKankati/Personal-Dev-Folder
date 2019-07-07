// Sreeteja Kankati Lab5

import java.io.*;
import java.util.Scanner;

public class Lab5
{

	public static void main(String[]args) throws IOException
	{
		File myFile = new File ("Fruits.txt");
		Scanner inFile = new Scanner (myFile);
		PrintWriter outFile = new PrintWriter("FruitsReport.txt");

	//Variables
		String item1,item2,item3;
		int quanity1,quanity2,quanity3;
		float price1,price2,price3;
		float total_1,total_2,total_3,grandTotal;

	//Assignments
		item1= inFile.nextLine();
        quanity1= inFile.nextInt();
		price1= inFile.nextFloat();

		inFile.nextLine(); // clears buffer

		item2= inFile.nextLine();
		quanity2= inFile.nextInt();
		price2= inFile.nextFloat();

		inFile.nextLine(); // clears buffer

		item3= inFile.nextLine();
		quanity3= inFile.nextInt();
		price3= inFile.nextFloat();

	//Calculations

		total_1= quanity1*price1;
		total_2= quanity2*price2;
		total_3= quanity3*price3;
		grandTotal= total_1+total_2+total_3;

	//Output

		inFile.close();
		System.out.printf(" \n\n%46s\n","Fruit Report ");
		System.out.println("*******************************************************************************************\n");
		System.out.printf("%5s%29s%22s%20s\n","Item","Quanity","Price","Total");
		System.out.printf("%5s%29s%22s%20s\n","","","($)", "($)");
		System.out.println("*******************************************************************************************\n\n");
		System.out.printf("%-15s%20d%20.2f%20.2f\n",item1,quanity1,price1,total_1);
		System.out.printf("%-15s%20d%20.2f%20.2f\n",item2,quanity2,price2,total_2);
		System.out.printf("%-15s%20d%20.2f%20.2f\n",item3,quanity3,price3,total_3);
		System.out.println("*******************************************************************************************\n\n");
		System.out.printf("                                     Grand Total ($) %23.2f  \n ", grandTotal);
		System.out.println("\n\n");
		inFile.close();


		outFile.printf(" \n\n%46s\n","Fruit Report ");
		outFile.println("**********************************************************************************************\n");
		outFile.printf("%5s%20s%20s%20s\n","Item","Quanity","Price","Total");
		outFile.printf("%5s%20s%20s%20s\n","","","($)", "($)");
		outFile.println("**********************************************************************************************8\n\n");
		outFile.printf("%-15s%20d%20.2f%20.2f\n",item1,quanity1,price1,total_1);
		outFile.printf("%-15s%20d%20.2f%20.2f\n",item2,quanity2,price2,total_2);
		outFile.printf("%-15s%20d%20.2f%20.2f\n",item3,quanity3,price3,total_3);
		outFile.println("**********************************************************************************************\n\n");
		outFile.printf("                                     Grand Total ($) %23.2f  \n ", grandTotal);
		outFile.println("\n\n");
		outFile.close();

	}
}



/*

                                     Fruit Report
*******************************************************************************************

 Item                      Quanity                 Price               Total
                                                     ($)                 ($)
*******************************************************************************************


Apples                           10               10.25              102.50
Bananas                          15                4.56               68.40
Grapes                            8                9.55               76.40
*******************************************************************************************


                                     Grand Total ($)                  247.30



Press any key to continue . . . */