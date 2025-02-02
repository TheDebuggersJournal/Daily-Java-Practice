import java.util.Scanner;

public class vowel_or_consonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string character to check: ");
		char str = sc.next().charAt(0);
		
		String vowels = "aeiouAEIOU";
		
		str = Character.toLowerCase(str);
		
		if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
			System.out.println(str+" is vowel!!");
		}
		else if ((str >= 'a' && str <= 'z')) {
			System.out.println(str + " is consonent!!");
		}
		else {
			System.out.println("!!Invalid Input!!");
		}

	}

}
