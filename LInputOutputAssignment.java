package selenium.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LInputOutputAssignment {

	public static void main(String[] args) throws IOException {

		/* 
		1 Declare two String variables-Firstnumber and Secondnumber
		2 ask the user to enter the first number and assign it to Firstnumber
		3 Do the parsing.
		4 Repeat the steps 2 and 3
		5 print the sum of 2 numbers
		*/
		
		//Using Scanner Class
		
		@SuppressWarnings("resource")
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int FirstNum=Obj.nextInt();
		System.out.println("Enter Second Number:");
		int SecondNum=Obj.nextInt();
		
		int sum;
		sum=FirstNum+SecondNum;
		System.out.println("The Sum of FirstNumber and SecondNumber = " +sum);

		//Using Parsing concept
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(" ");
		System.out.println("Enter a First Number : ");
		String input1=" ";
		input1=br.readLine();
		int FirstNumber= Integer.parseInt(input1);
		
		
		System.out.println("Enter a Second Number : ");
		String input2=" ";
		input2=br.readLine();
		int SecondNumber= Integer.parseInt(input2);
		
		
		System.out.println("First Number = " +input1);
		System.out.println("Second Number= " +input2);
		
		
		//Adding FirstNumber and Second Number
		
		int Sum;
		Sum=FirstNumber+SecondNumber;
		
		System.out.println("The Sum of FirstNumber and SecondNumber = " +Sum);

	}

}
