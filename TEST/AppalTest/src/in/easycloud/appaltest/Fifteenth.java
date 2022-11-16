package in.easycloud.appaltest;

import java.util.Scanner;

public class Fifteenth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
		int year= scanner.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Its a LEAP YEAR");
		} else {
			System.out.println("Its not a LEAP YEAR");
		}
	}
}
