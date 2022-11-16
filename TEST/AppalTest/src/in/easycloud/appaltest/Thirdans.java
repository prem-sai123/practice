package in.easycloud.appaltest;

import java.util.Scanner;

public class Thirdans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Aplabet : ");
		 char alphabet = scanner.next().charAt(0);
		 if(alphabet == Character.toUpperCase(alphabet)) {
			 System.out.println("Upper Case Character");
		 } else {
			 System.out.println("Lower Case Character");
		 }
	}
}
