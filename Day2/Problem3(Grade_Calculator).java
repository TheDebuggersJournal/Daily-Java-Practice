import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] marks = new int[5];
		
		for(int i=0; i<marks.length; i++) {
			System.out.printf("Enter your subject %d marks out of 100: ",i+1);
			marks[i] = sc.nextInt();
			
		}
		int sum = 0;
		for (int subject: marks) {
			sum += subject;
		}
		//System.out.printf("Sum = %d",sum);
		
		float percentage = (float) sum/5;
		//System.out.printf("percentage: %.2f",percentage);
		
		if (percentage > 75) {
			System.out.printf("Percentage is %.2f and passed by first class with distinction",percentage);
		}
		else if (percentage < 75 && percentage >=60) {
			System.out.printf("Percentage is %.2f and passed by First class",percentage);
		}
		else if (percentage < 60 && percentage >=50) {
			System.out.printf("Percentage is %.2f and passed with Second Class",percentage);
		}
		else if (percentage < 50 && percentage >= 40) {
			System.out.printf("Percentage is %.2f and passed with Third Class",percentage);
		}
		else {
			System.out.printf("Percentage is %.2f and faiiled this year",percentage);
		}
		
	}

}
