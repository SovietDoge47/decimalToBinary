package decimalToBinary;
import java.util.Scanner;

public class decimalToBinary
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a decimal: ");
		
		int number = keyboard.nextInt();
		int originalNumber = number;
		String binaryNumber = "";
		int binaryDigit;
		
		//number % 2, concatenate result to 'String binaryNumber'
		//Divide number by 2 and repeat
		//Stop when number is less than or equal to 1
		while(number >= 1)
		{
			binaryDigit = number % 2;
			binaryNumber = binaryDigit + binaryNumber;
			number = number / 2;
		}
		System.out.println("'" + originalNumber + "' is equal to '" + binaryNumber + "' in binary");
	}
}
