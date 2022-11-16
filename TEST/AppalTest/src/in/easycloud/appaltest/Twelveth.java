package in.easycloud.appaltest;

import java.util.Scanner;

public class Twelveth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your Angel-1 : ");
		int angle1 = scanner.nextInt();
		System.out.print("Please enter your Angel-2 : ");
		int angle2 = scanner.nextInt();
		System.out.print("Please enter your Angel-3 : ");
		int angle3 = scanner.nextInt();
		int sum = angle1 + angle2+angle3;
		if(sum == 180) {
			System.out.print("Yahooo..! Its a triangle");
		} else {
			System.out.print("Oops..! Its not a triangle");
		}
	}
}
