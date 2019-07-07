//Sreeteja Kankati

import java.io.*;
import java.util.Scanner;


public class Lab6
{
	public static void main(String[]args) throws IOException

	{
		File myFile = new File ("Barcode.txt");
		Scanner inFile = new Scanner (myFile);
		PrintWriter outFile = new PrintWriter("Receipt.txt");
		Scanner kb = new Scanner(System.in);

		String barcode,str,deptName,monthName,moneySign;
		int partNum,deptCode;
		int month,day,year,discountRate;
		float price,discount,tax,discountedPrice,total,taxRate;
		boolean purchaser_Discount;
		char response;


		moneySign= "$";
		taxRate=(float)6.625;
		discountRate=10;
		discount = (float).10;


		barcode= inFile.nextLine();

		str = barcode.substring(0,4);
		deptCode=Integer.parseInt(str);

		str = barcode.substring(4,10);
		partNum=Integer.parseInt(str);

		str = barcode.substring(10,12);
		month= Integer.parseInt(str);

		str = barcode.substring(12,14);
		day= Integer.parseInt(str);

		str = barcode.substring(14,16);
		year= Integer.parseInt(str);
		year= 2000+year;

		str = barcode.substring(16,20);
		price= Float.parseFloat(str);
		price= price/100;
		discount= price*discount;
		discountedPrice= price-discount;
		tax=((float)(6.625/100)*discountedPrice);
		total= discountedPrice+tax;

		deptName="";
		if ( deptCode>1000 && deptCode<=1999)
		{
			deptName="Clothing";
        }

        else if (deptCode>1999 && deptCode<=2999)
        {
			deptName="Hardware Department";
		}
		else if (deptCode>2999 && deptCode<=3999)
		{
				deptName="Food";
		}
		else if (deptCode>3999 && deptCode<=4999)
		{
				deptName="Toys";
		}
		else if (deptCode>4999 && deptCode<=5999)
		{
				deptName="Sporting Goods";
		}
		else if (deptCode>5999 && deptCode<=9999)
		{
				deptName="Misc.";
		}

		 			monthName="";
		switch(month)

		{
			case 1 :monthName = "January";
			break;

			case 2 :monthName = "February";
			break;

			case 3 :monthName = "March";
			break;

			case 4 :monthName = "April";
			break;

			case 5 :monthName = "May";
			break;

			case 6 :monthName = "June";
			break;

			case 7 :monthName = "July";
			break;

			case 8 :monthName = "August";
			break;

			case 9 :monthName = "September";
			break;

			case 10 :monthName = "October";
			break;

			case 11 :monthName = "November";
			break;

			case 12 :monthName = "December";
			break;
		}

		System.out.println("Do you have a Discount? Enter Y/N.");
		response=kb.next().toUpperCase().charAt(0);
		if (response == 'Y')
		{
			purchaser_Discount= true;
	    }

	    else
	    {
			purchaser_Discount= false;
	    }

		if (purchaser_Discount)

		{
			System.out.printf(" ACME STORE %10s %d, %d\n " ,monthName ,day ,year);
			System.out.printf("%10s\n ",deptName);
			System.out.printf("Item# %5d\n ",partNum);
			System.out.printf("Price %20s%.2f\n",moneySign,price);
			System.out.printf(" Discount(%d%%) %12s%.2f\n",discountRate,moneySign,discount);
			System.out.printf(" Tax(%.3f%%) %14s%.2f\n",taxRate,moneySign,tax);
			System.out.printf(" Total %20s%.2f\n",moneySign,total);
			System.out.println("*********************************************************************************\n");
		}

		else
		{
			System.out.printf(" ACME STORE %10s %d, %d\n " ,monthName ,day ,year);
			System.out.printf("%10s\n ",deptName);
			System.out.printf("Item# %5d\n ",partNum);
			System.out.printf("Price %20s%.2f\n",moneySign,price);
			System.out.printf(" Tax(%.3f%%) %14s%.2f\n",taxRate,moneySign,tax);
			System.out.printf(" Total %20s%.2f\n",moneySign,price);
			System.out.println("*********************************************************************************\n");
	     }

}


}

			/*Do you have a Discount? Enter Y/N.
			Y
			 ACME STORE       June 3, 2019
			 Hardware Department
			 Item# 999999
			 Price                    $31.50
			 Discount(10%)            $3.15
			 Tax(6.625%)              $1.88
			 Total                    $30.23
			*********************************************************************************

Press any key to continue . . .*/




/*Do you have a Discount? Enter Y/N.
n
 ACME STORE       June 3, 2019
 Hardware Department
 Item# 999999
 Price                    $31.50
 Tax(6.625%)              $1.88
 Total                    $31.50
*********************************************************************************

Press any key to continue . . .*/