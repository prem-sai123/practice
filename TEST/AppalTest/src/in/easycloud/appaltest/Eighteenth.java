package in.easycloud.appaltest;

import java.util.Scanner;

public class Eighteenth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number to get fibonacci series upto : ");
		int num = scanner.nextInt();
		int firstNum =0 , secondNum =1;
		System.out.print(firstNum+" "+secondNum);
		for(int i=1;i<num;i++) {
			int sum = firstNum + secondNum;
			System.out.print(" "+sum);
			firstNum = secondNum;
			secondNum = sum;
		}
	}
}
