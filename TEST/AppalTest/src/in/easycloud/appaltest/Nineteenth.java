package in.easycloud.appaltest;

import java.util.Scanner;

public class Nineteenth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number : ");
		int num = scanner.nextInt();
		double sum =0;
		for(int i=1;i<=num;i++) {
			sum += 1.0/(i);
		}
		System.out.println(sum);
	}
}
