import java.util.Scanner;

public class Swappingtwonumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if (number%2==0)
            System.out.printf("%d is even",number);
        else
            System.out.printf("%d is odd",number);
        

	}
}
