import java.util.Scanner;

public class Sumoftwonumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();

        System.out.printf("sum of %d and %d is %d",number1,number2,(number1+number2));
	}
}
