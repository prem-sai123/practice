package in.easycloud.appaltest;

import java.util.Scanner;

public class Ninthans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Please enter second number : ");
		int num2 = scanner.nextInt();
		if((num1 > 9) || (num2 > 9)) {
			System.out.println("Invalid Inputs");
		} else {
			System.out.println("The Sumation of "+num1+" and "+num2+" is : "+num1+num2);
			System.out.println("The Difference between "+num1+" and "+num2+" is : "+(num1-num2));
			System.out.println("The Multiplication of "+num1+" and "+num2+" is : "+(num1*num2));
			System.out.println("The Remainder of "+num1+" and "+num2+" is : "+(num1/num2));
			System.out.println("The Exponent of "+num1+" and "+num2+" is : "+(num1^num2));
		}
	}
}
