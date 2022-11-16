package in.easycloud.appaltest;

import java.util.Scanner;

public class Fourteenth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, temp, sum = 0, remainder;
		System.out.println("Please Enter Number : ");
		num = scanner.nextInt();
		temp = num;
		while (num % 10 > 0) {
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num = num / 10;
		}
		if(sum == temp) {
			System.out.println("Its a Palindrome Number");
		} else {
			System.out.println("Its not a Palindrome Number");
		}
	}
}
