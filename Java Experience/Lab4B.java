
import java.util.Scanner;
import java.io.*;
public class Lab4B
{
	public static void main (String[]args) throws IOException
	{
		Scanner kb = new Scanner(System.in);

		//Variables
		String name1,name2,name3,str;
		float average,original_Average,price1,price2,price3, percent_Change;
		int total_Weight,weight1,weight2,weight3;

		PrintWriter pw = new PrintWriter("Lab4B.txt");

		//Assignments
		System.out.println("Enter Name1, Name2 and Name3");
		name1= kb.nextLine();
		name2= kb.nextLine();
		name3= kb.nextLine();

		System.out.println("Enter Weight 1");
		str= kb.nextLine();
		weight1= Integer.parseInt(str);

		System.out.println("Enter Weight 2");
		str= kb.nextLine();
	    weight2= Integer.parseInt(str);

		System.out.println("Enter Weight 3");
		str= kb.nextLine();
		weight3= Integer.parseInt(str);

		System.out.println("Enter Price 1");
		str= kb.nextLine();
		price1= Float.parseFloat(str);

		System.out.println("Enter Price 2");
		str= kb.nextLine();
		price2= Float.parseFloat(str);

		System.out.println("Enter Price 3");
		str= kb.nextLine();
		price3= Float.parseFloat(str);

		original_Average= (float)19.11;

		//Calculation

		average = (price1+price2+price3)/3;
		total_Weight = weight1+weight2+weight3;
		percent_Change =(((average-original_Average)/original_Average)*100);

		//Output
		System.out.printf("A total of " +total_Weight + " lbs of widgets were sold at an average price of %s" + " The details for each salespersob are: \n\n " , String.format("$%.2f", average));
		System.out.printf("%16s%15s%20s\n","Name","Number","Price");
		System.out.printf("%16s%15s%20s\n","(name)","(lbs)", "($)");
		System.out.println("********************************************************************\n\n");
		System.out.printf("%16s%15d%20s\n ",name1,weight1,String.format("$%.2f", price1));
		System.out.printf("%15s%15d%20s\n ",name2,weight2,String.format("$%.2f", price2));
		System.out.printf("%15s%15d%20s\n ",name3,weight3,String.format("$%.2f", price3));
		System.out.printf("This represents A %.1f%% increase from last month! \n ", percent_Change);
		System.out.println("********************************************************************\n\n");
		System.out.println("\n\n");




		pw.printf("A total of " +total_Weight + " lbs of widgets were sold at an average price of %s" + " The details for each salespersob are: \n\n " , String.format("$%.2f", average));
		pw.printf("%16s%15s%20s\n","Name","Number","Price");
		pw.printf("%16s%15s%20s\n","(name)","(lbs)", "($)");
		pw.println("********************************************************************\n\n");
		pw.printf("%16s%15d%20s\n ",name1,weight1,String.format("$%.2f", price1));
	 	pw.printf("%15s%15d%20s\n ",name2,weight2,String.format("$%.2f", price2));
		pw.printf("%15s%15d%20s\n ",name3,weight3,String.format("$%.2f", price3));
		pw.printf("This represents A %.1f%% increase from last month! \n ", percent_Change);
		pw.println("********************************************************************\n\n");
		pw.println("\n\n");



	}
}


/*Enter Name1, Name2 and Name3
Joe
Ann
Betty
Enter Weight 1
235
Enter Weight 2
111
Enter Weight 3
186
Enter Price 1
23
Enter Price 2
25.26
Enter Price 3
24.25
A total of 532 lbs of widgets were sold at an average price of $24.17 The details for each salespersob are:

             Name         Number               Price
          (name)          (lbs)                 ($)
********************************************************************


             Joe            235              $23.00
             Ann            111              $25.26
           Betty            186              $24.25
 This represents A 25.1% increase from last month!
 ********************************************************************





Press any key to continue . . .*/