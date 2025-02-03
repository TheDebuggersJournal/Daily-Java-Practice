package myPractice;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for Multiplication Table: ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d\n",num,i,(num*i));
		}
		

	}

}
