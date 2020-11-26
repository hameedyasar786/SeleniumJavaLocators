package selenium.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class LInputOutputTest {

	public static void main(String[] args) throws IOException {
		

		
		/*@SuppressWarnings("resource")
		Scanner Obj=new Scanner(System.in);
		System.out.println("please Enter your number=");
		int num=Obj.nextInt();
		System.out.println("Multiplication by 5 is "+num*5);*/
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enetr a number = ");
		String input=" ";
		input=br.readLine();
		System.out.println("Input Value is " +input);
		
		int number= Integer.parseInt(input);//converting String datatype to interger datatype(parsing)
		System.out.println("Multiplication by 5 is "+number*5);

	}

}

