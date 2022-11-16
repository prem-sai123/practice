package in.easycloud.appaltest;

import java.util.Scanner;

public class Thirteenth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Please Enter Number 1 : ");
		num1 = scanner.nextInt();
		System.out.println("Please Enter Number 2 : ");
		num2 = scanner.nextInt();
		System.out.println("Please Enter Number 3 : ");
		num3 = scanner.nextInt();
		Boolean isEqual = num1 == num2 && num2 == num3;
		if(isEqual){
			System.out.println("All are equal");
		}else if(num1 > num2 || num1>num3) {
			System.out.println(num1+" is the Largest Number.");
		} else if(num2 == num3) {
			System.out.println(num2 +" is the greatest number and number 2 : "+num2+" and number 3: "+num3+" are equal numbers.");
		} else if (num2 > num3) {
			System.out.println(num2+" is the Largest Number.");
		} else {
			System.out.println(num3+" is the Largest Number.");
		}
	}
}
