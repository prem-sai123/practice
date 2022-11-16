package in.easycloud.appaltest;

import java.util.Scanner;

public class Seventhans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2,num3;
		System.out.println("Please Enter Number 1 : ");
		num1 = scanner.nextInt();
		System.out.println("Please Enter Number 2 : ");
		num2 = scanner.nextInt();
		System.out.println("Please Enter Number 3 : ");
		num3 = scanner.nextInt();
		System.out.println("Average of three numbers : "+(num1+num2+num3)/3);
//		if((num1 % 1 == 0) || (num2 % 1 == 0) || (num3 % 1 == 0)) {
//			System.out.println("INVALID NUMBERS");
//		} else {
//			
//		}
	}
}
