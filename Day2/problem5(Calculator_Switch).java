import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		float number1 = sc.nextInt();
		System.out.println("Enter second number");
		float number2 = sc.nextInt();
		System.out.println("#---------Calculator---------#");
		System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.printf("Addition of %.2f and %.2f is %.2f",number1,number2,(number1+number2));
			break;
		case 2:
			System.out.printf("Subtraction of %.2f and %.2f is %.2f",number1,number2,(number1-number2));
			break;
		case 3:
			System.out.printf("Multiplication of %.2f and %.2f is %.2f",number1,number2,(number1*number2));
			break;
		case 4:
			System.out.printf("Division of %.2f and %.2f is %.2f",number1,number2,(number1/number2));	
			break;
		}

	}
