import java.util.Scanner;
public class User_Input
{
	public static void main(String[]args)
	{
		float i1;
		float i2;
		float i3;

	Scanner kb = new Scanner(System.in);

	System.out.println("Enter i1");
	// To input Ints i1= kb.nextInt();
	i1= kb.nextFloat(); //to input floats
	// To input Strings i1= kb.nextLine();
	System.out.println("Enter i2");
	//i2= kb.nextInt();
	i2= kb.nextFloat();
	i3 = i1+i2;
	System.out.println("The sum of int i1 and i2 is: "+i3);
}
}

