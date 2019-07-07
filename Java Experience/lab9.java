//Sreeteja Kankati
//Lab 9


import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class lab9
{


	public static void main(String[]args)throws IOException
	{
		int maxRows=36;
		int id;
		String name;
		int year;
		String teamName;
		int yearsPlayed;
		float battingAverage;
		int i,nrows,row,choice,inputId,sumYears;
		String inputName;
		float avgYearsPlayed;
		Player[] players= new Player[maxRows];

		File myFile = new File("Baseball.dat");
		PrintWriter outFile = new PrintWriter("BaseballReport.txt");
		Scanner inFile = new Scanner(myFile);
		Scanner kb=new Scanner(System.in);
		i=0;
	while(inFile.hasNext())
	{
		id=inFile.nextInt();
		inFile.nextLine();
		name=inFile.nextLine().trim();
		year=inFile.nextInt();
		inFile.nextLine();
		teamName=inFile.nextLine().trim();
		yearsPlayed=inFile.nextInt();
		battingAverage=inFile.nextFloat();
		players[i]=new Player(id,name,year,teamName,yearsPlayed,battingAverage);
		i++;
	}
	nrows=i;
	inFile.close();
	for(i=0;i<nrows;i++)
	System.out.println(players[i].toString());
	do{
		inFile=new Scanner(myFile);
	System.out.println("Please Choose one of the following choices: \n ");
	System.out.println("1: Average Years Played \n\n2: Print Table Sorted by Team\n\n3: Print Table Sorted by Batting average(descending) \n\n4: Search for name \n\n5: You chose Search for ID \n\n6: You chose quite \n");
	choice=kb.nextInt();

	switch(choice)
	{
		case 1: System.out.println("You chose Average Years Played: \n ");
				outFile.println("You chose Average Years Played: \n ");
					sumYears=0;
					avgYearsPlayed=0;
					for(i=0;i<nrows;i++)
					{
						sumYears= sumYears+players[i].getYearsPlayed();
				    }
				    avgYearsPlayed=(float)sumYears/nrows;
				    System.out.printf("%-5s%10.2f\n ","The Average years played was:",avgYearsPlayed);
				    outFile.printf("%-5s%10.2f\n ","The Average years played was:",avgYearsPlayed);


				break;

		case 2: System.out.println("You chose Print Table Sorted by Team: \n ");
				System.out.printf("%-5s   %-25s%10s   %-25s%10s   %10s\n","Id","Name","Year","TeamName","YearsPlayed","BattingAverage");
				outFile.println("You chose Print Table Sorted by Team: \n ");
				outFile.printf("%-5s   %-25s%10s   %-25s%10s%10s\n ","id","name","year","teamName","yearsPlayed","battingAverage");

				for(row=0;row<nrows-1;row++)
					for(i=row+1;i<nrows;i++)

						if(players[i].getTeamName().compareToIgnoreCase(players[row].getTeamName())<0)
							{
								swap(players,row,i);

						    }

				for(i=0;i<nrows;i++)
			{
				System.out.println(players[i].toString());
				outFile.println(players[i].toString());
			}
				break;

		case 3: System.out.println("You chose Print Table Sorted by Batting average(descending): \n ");
				System.out.printf("%-5s   %-25s%10s   %-25s%10s   %10s\n","Id","Name","year","TeamName","YearsPlayed","BattingAverage");
				outFile.println("You chose Print Table Sorted by Batting average(descending): \n ");
				outFile.printf("%-5s   %-25s%10s   %-25s%10s   %10s\n ","Id","name","year","teamName","yearsPlayed","battingAverage");
				for(row=0;row<nrows-1;row++)
					for(i=row+1;i<nrows;i++)
					if(players[i].getBattingAverage()>players[row].getBattingAverage())
				{
								swap(players,row,i);

				}

								for(i=0;i<nrows;i++)

			{
				System.out.println(players[i].toString());
				outFile.println(players[i].toString());
			}


				break;

		case 4: System.out.println("You chose Search for name \n ");
				System.out.println("Enter Name ");
				outFile.println("You chose Search for name \n ");
				outFile.println("Enter Name ");
				kb.nextLine();
				inputName=kb.nextLine().trim();
				for(i=0;i<nrows;i++)
				if(inputName.equalsIgnoreCase(players[i].getName()))
				{
					System.out.printf("%-5s   %-25s%10s   %-25s%10s   %10s\n","Id","Name","year","TeamName","YearsPlayed","BattingAverage");
					System.out.println(players[i].toString());
					outFile.printf("%-5s%10s%12s%10s%10s%10s\n ","id","name","year","teamName","yearsPlayed","battingAverage");
					outFile.println(players[i].toString());
				}
					break;

		case 5: System.out.println("You chose Search for ID: \n ");
				System.out.println("Enter an ID ");
				outFile.println("You chose Search for ID: \n ");
				outFile.println("Enter an ID ");
				inputId=kb.nextInt();
				for(i=0;i<nrows;i++)
				if(inputId==players[i].getId())
			{
				System.out.printf("%-5s   %-25s%10s   %-25s%10s   %10s\n","Id","Name","year","TeamName","YearsPlayed","BattingAverage");
				System.out.println(players[i].toString());
				outFile.printf("%-5s%10s%12s%10s%10s%10s\n ","id","name","year","teamName","yearsPlayed","battingAverage");
				outFile.println(players[i].toString());
			}
					break;



		case 6: System.out.println("You chose quit: \n ");
				outFile.println("You chose quit: \n ");
				break;
}
	} 	while(choice!=6);
	}

		public static void swap(Player[]a,int i, int j)
		{
			Player temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}

}
		//#2
		/*2
		You chose Print Table Sorted by Team:

		Id      Name                           Year   TeamName                 YearsPlayed   BattingAverage
		34      Rod Carew                      1991   Angels                           19     0.328

		1       Hank Aaron                     1982   Atlanta                          23     0.305

		22      Wade Boggs                     2005   Boston                           18     0.328

		7       Luis Aparicio                  1984   Boston                           18     0.262

		33      Roy Campanella                 1969   Brooklyn Dodgers                 10     0.276

		35      Max Carey                      1961   Brooklyn Dodgers                 20     0.285

		28      Dan Brouthers                  1945   Buffalo                          19     0.342

		29      Mordecai Brown                 1949   Chicago Cubs                     14     0.206

		6       Cap Anson                      1939   Chicago Cubs                     27     0.334

		25      Roger Bresnahan                1945   Chicago Cubs                     17     0.279

		15      Ernie Banks                    1977   Chicago Cubs                     19     0.274

		8       Luke Appling                   1964   Chicago White Sox                20     0.310

		12      Harold Baines                  2019   Chicago White Sox                22     0.289

		17      Johnny Bench                   1989   Cincinatti                       17     0.267

		24      Lou Boudreau                   1970   Cleveland                        15     0.295

		10      Earl Averill                   1975   Cleveland                        13     0.318

		32      Jesse Burkett                  1946   Cleveland                        16     0.338

		31      Jim Bunning                    1996   Detroit                          17     0.167

		11      Jeff Bagwell                   2017   Houston                          15     0.297

		20      Craig Biggio                   2015   Houston                          20     0.281

		26      George Brett                   1999   Kansas City                      21     0.305

		3       Roberto Alomar                 2011   Mets                             17     0.300

		21      Bert Blyleven                  2011   Minnesota                        22     0.131

		2       Pete Alexander                 1938   Philadelphia                     20     0.209

		9       Richie Ashburn                 1995   Philadelphia                     15     0.308

		16      Jake Beckley                   1971   Pittsburg                        20     0.308

		30      Willard Brown                  2006   St. Louis                         1     0.179

		23      Jim Bottomley                  1974   St. Louis                        16     0.310

		4       Walter Alston                  1983   St. Louis                         1     0.000

		19      Yogi Berra                     1972   Yankees                          19     0.285

		13      Home Run Baker                 1955   Yankees                          13     0.307

		Please Choose one of the following choices:

		1: Average Years Played

		2: Print Table Sorted by Team

		3: Print Table Sorted by Batting average(descending)

		4: Search for name

		5: You chose Search for ID

        6: You chose quite */

        //#3
        /*3
		You chose Print Table Sorted by Batting average(descending):

		Id      Name                           year   TeamName                 YearsPlayed   BattingAverage
		28      Dan Brouthers                  1945   Buffalo                          19     0.342

		32      Jesse Burkett                  1946   Cleveland                        16     0.338

		6       Cap Anson                      1939   Chicago Cubs                     27     0.334

		22      Wade Boggs                     2005   Boston                           18     0.328

		34      Rod Carew                      1991   Angels                           19     0.328

		10      Earl Averill                   1975   Cleveland                        13     0.318

		23      Jim Bottomley                  1974   St. Louis                        16     0.310

		8       Luke Appling                   1964   Chicago White Sox                20     0.310

		16      Jake Beckley                   1971   Pittsburg                        20     0.308

		9       Richie Ashburn                 1995   Philadelphia                     15     0.308

		13      Home Run Baker                 1955   Yankees                          13     0.307

		26      George Brett                   1999   Kansas City                      21     0.305

		1       Hank Aaron                     1982   Atlanta                          23     0.305

		3       Roberto Alomar                 2011   Mets                             17     0.300

		11      Jeff Bagwell                   2017   Houston                          15     0.297

		24      Lou Boudreau                   1970   Cleveland                        15     0.295

		12      Harold Baines                  2019   Chicago White Sox                22     0.289

		19      Yogi Berra                     1972   Yankees                          19     0.285

		35      Max Carey                      1961   Brooklyn Dodgers                 20     0.285

		20      Craig Biggio                   2015   Houston                          20     0.281

		25      Roger Bresnahan                1945   Chicago Cubs                     17     0.279

		33      Roy Campanella                 1969   Brooklyn Dodgers                 10     0.276

		15      Ernie Banks                    1977   Chicago Cubs                     19     0.274

		17      Johnny Bench                   1989   Cincinatti                       17     0.267

		7       Luis Aparicio                  1984   Boston                           18     0.262

		2       Pete Alexander                 1938   Philadelphia                     20     0.209

		29      Mordecai Brown                 1949   Chicago Cubs                     14     0.206

		30      Willard Brown                  2006   St. Louis                         1     0.179

		31      Jim Bunning                    1996   Detroit                          17     0.167

		21      Bert Blyleven                  2011   Minnesota                        22     0.131

		4       Walter Alston                  1983   St. Louis                         1     0.000

		Please Choose one of the following choices:

		1: Average Years Played

		2: Print Table Sorted by Team

		3: Print Table Sorted by Batting average(descending)

		4: Search for name

		5: You chose Search for ID

        6: You chose quite */