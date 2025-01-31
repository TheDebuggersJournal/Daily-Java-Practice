import java.util.Scanner;

public class Swappingtwonumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int number2 = sc.nextInt();

        if (number1 > number2)
            System.out.printf("%d is greater than %d",number1,number2);
        else
            System.out.printf("%d is greater than %d", number2, number1);


	}
}
