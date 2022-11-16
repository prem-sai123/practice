package in.easycloud.appaltest;

import java.util.Scanner;

public class Sixthans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2,num3;
		System.out.println("Please Enter Number 1 : ");
		num1 = scanner.nextInt();
		System.out.println("Please Enter Number 2 : ");
		num2 = scanner.nextInt();
		System.out.println("Please Enter Number 3 : ");
		num3 = scanner.nextInt();
		System.out.println("Sum of Three Numbers is : "+(num1+num2+num3));
	}
}
