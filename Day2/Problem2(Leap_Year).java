import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year = sc.nextInt();
		
		if (year%4== 0 || year%100 == 0 && year%400 !=0) {
			System.out.printf("%d is a leap year",year);
		}
		else
		{
			System.out.printf("%d is not a leap year",year);
		}
		

	}

}
