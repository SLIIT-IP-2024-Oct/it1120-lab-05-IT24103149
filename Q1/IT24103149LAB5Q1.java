import java.util.Scanner;

public class IT24103149LAB5Q1
{
public static void main(String[]args)
{
	//create an object named input to Scanner class
	Scanner input = new Scanner(System.in);
	
	//declare variables
	int num1,num2,num3,smallest,largest;

	//take input from user for the first integer value
	System.out.println("Enter the first integer: ");
	num1 = input.nextInt();

	//take input from user for the second integer value
	System.out.println("Enter the second integer: ");
	num2 = input.nextInt();

	//take input from user for the third integer value
	System.out.println("Enter the third integer: ");
	num3 = input.nextInt();

	//calculate
	smallest = num1;//assume num1 is the smallest
	largest = num2;// assume num1 is the largest

	//check if num2 is smallest or largest
	if (num2<num1)
{
	smallest = num2;
}
	if (num2>num1)
{
	largest = num2;
}

	//check if num3 is smallest or largest
	if (num3<num2)
{
	smallest = num3;
}
	if (num3>num2)
{
	largest = num3;
}
	
	//display output
	
	System.out.println("User entered numbers are: "+num1+" " +num2+" " + num3);
	System.out.println("The Smallest number is: "+smallest);
	System.out.println("The Largest number is: "+largest);


	}
}
	
