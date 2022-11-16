package in.easycloud.appaltest;

import java.util.Scanner;

public class Fifthans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int num1 = scanner.nextInt();

		switch ((num1 % 2 == 0) ? 1 : 0) {
		case 0:
			System.out.println("The Given number " + num1 + " is ODD NUMBER");
			break;
		case 1:
			System.out.println("The Given number " + num1 + " is EVEN NUMBER");
			break;
		default:
			System.out.println("The Given number " + num1 + " is INVALID");
			break;
		}
	}
}
