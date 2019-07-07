//Sreeteja Kankati


import java.util.Scanner;

public class Lab3
{
	public static void main (String[]args)
		{
			float length1, length2, length3;
			float width1, width2, width3;
			float area1, area2, area3;
			float price_Per_Carpet;
			float price_Of_room1, price_Of_room2, price_Of_room3;
			String room1, room2, room3;


			price_Per_Carpet = 10;

			Scanner kb = new Scanner (System.in);

			System.out.println("Enter Name for room1");
			room1=kb.nextLine();

			System.out.println("Enter Name for room2");
			room2=kb.nextLine();

			System.out.println("Enter Name for room3");
			room3=kb.nextLine();

			System.out.println("Enter length1 for room1");
			length1=kb.nextFloat();

			System.out.println("Enter width1 for room1");
			width1=kb.nextFloat();

			System.out.println("Enter length2 for room2");
			length2=kb.nextFloat();

			System.out.println("Enter width2 for room2");
			width2=kb.nextFloat();

			System.out.println("Enter length3 for room3");
			length3=kb.nextFloat();

			System.out.println("Enter width3 for room3");
			width3=kb.nextFloat();

			area1= (float)length1*width1;
			area2= (float)length2*width2;
			area3= (float)length3*width3;

			price_Of_room1 = area1* price_Per_Carpet;
			price_Of_room2 = area2* price_Per_Carpet;
			price_Of_room3 = area3* price_Per_Carpet;


						System.out.println("\n\n ***************************************************************\n " );
						System.out.printf(" \n\n%46s\n","Carpet Room ");
						System.out.println("********************************************************************\n");
						System.out.printf("%5s%20s%20s%20s%20s\n","Name","Length","Width","Area","Price of room");
						System.out.printf("%25s%20s%15s%20s\n","(ft)","(cu ft)","(sqft)", "($)");
						System.out.println("********************************************************************\n\n");
						System.out.printf("%15s%10.2f%20.2f%15.2f%15.2f\n ",room1,length1,width1,area1,price_Of_room1);
						System.out.printf("%15s%10.2f%20.2f%15.2f%15.2f\n",room2,length2,width2,area2,price_Of_room2);
						System.out.printf("%15s%10.2f%20.2f%15.2f%15.2f\n",room3,length3,width3,area3,price_Of_room3 );
						System.out.println("********************************************************************\n\n");
			  			System.out.println("\n\n");
			}
}


			Enter Name for room1
			Bed
			Enter Name for room2
			Living
			Enter Name for room3
			Dining
			Enter length1 for room1
			1
			Enter width1 for room1
			2
			Enter length2 for room2
			3
			Enter width2 for room2
			4
			Enter length3 for room3
			5
			Enter width3 for room3
			6


			/* ***************************************************************



			                                  Carpet Room
			********************************************************************

			 Name              Length               Width                Area       Price of room
			                     (ft)             (cu ft)         (sqft)                 ($)
			********************************************************************


			            Bed      1.00                2.00           2.00          20.00
			          Living      3.00                4.00          12.00         120.00
			         Dining      5.00                6.00          30.00         300.00
			********************************************************************





Press any key to continue . . .


