package in.easycloud.appaltest;

import java.util.*;

public class Eighthans {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		double total = 0;
		for(int i=1 ; i<=4 ; i++) {
			System.out.print("Enter marks for course : "+i);
			int num1= scanner.nextInt();
			list.add(num1);
		}
		for(int mark : list) {
			total =total+mark;
		}
		System.out.println("Avg of 4 courses is : "+total/4);
	}
}
