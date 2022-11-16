package in.easycloud.appaltest;

import java.util.Scanner;

public class Tenthans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your name : ");
		String name = scanner.nextLine();
		System.out.println("Please Enter your age : ");
		int age = scanner.nextInt();
		System.out.println("Please Enter current year : ");
		int year = scanner.nextInt();
		System.out.println(year - age);
	}
}
