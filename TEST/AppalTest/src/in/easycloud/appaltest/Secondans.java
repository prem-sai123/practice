package in.easycloud.appaltest;

import java.util.Scanner;

public class Secondans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Month Number : ");
		int day = scanner.nextInt();
		switch (day) {
		case 1:
			System.out.println(day +" st month have 31 days");
			break;
		case 2:
			System.out.println(day+" nd month can have 28/29 days");
			break;
		case 3:
			System.out.println(day+" rd month have 31 days");
			break;
		case 4:
			System.out.println(day+" th month have 30 days");
			break;
		case 5:
			System.out.println(day+" th month have 31 days");
			break;
		case 6:
			System.out.println(day+" th month have 30 days");
			break;
		case 7:
			System.out.println(day+" th month have 31 days");
			break;
		case 8:
			System.out.println(day+" th month have 31 days");
			break;
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;
		default:
			System.out.println("Please enter month number between 1-12");
		}
	}
}
