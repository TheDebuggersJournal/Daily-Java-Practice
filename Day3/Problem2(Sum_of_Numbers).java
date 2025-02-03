package myPractice;

import java.util.Scanner;

public class Sum_of_Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number upto which you want to find sum: ");
		int x = sc.nextInt();
		int sum= 0;
		for (int i=1; i<=x;i++) {
			sum += i;
		}
		System.out.printf("The sum of first %d natural numbers is equal to: %d",x,sum);

	}

}
