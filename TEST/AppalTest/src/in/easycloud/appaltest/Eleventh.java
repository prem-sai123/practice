package in.easycloud.appaltest;

import java.util.Scanner;

public class Eleventh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your number : ");
		int num = scanner.nextInt();
		String ans = (num%2 == 0) ? "Entered Number is EVEN":"Entered Number is ODD";
		System.out.println(ans);
	}
}
