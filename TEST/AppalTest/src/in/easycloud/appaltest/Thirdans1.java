package in.easycloud.appaltest;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Thirdans1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Aplabet : ");
		 char alphabet = scanner.next().charAt(0);
	      String str = "aeiou";
	      List<Character> list = str.chars().mapToObj(n -> (char)n).collect(Collectors.toList());
	  
	}
}
