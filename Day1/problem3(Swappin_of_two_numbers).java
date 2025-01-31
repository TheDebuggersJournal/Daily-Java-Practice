import java.util.Scanner;

public class Swappingtwonumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = sc.nextInt();
        int number3 = number1;
        number1 = number2;
        number2 = number3;


        System.out.printf("number1 after swapping is %d and number2 after swapping is %d",number1,number2);
	}
}
