import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if (number<0) {
			System.out.printf("%d is negative",number);
			}
		else if (number == 0)
			System.out.printf("%d is equal to zero",number);
		else
			System.out.printf("%d is positive and greater than zero",number);
			
		

	}

}
