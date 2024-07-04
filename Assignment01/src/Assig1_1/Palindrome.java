package Assig1_1;
import java.util.Scanner;
public class Palindrome {
	public static int palindrome(int num) {
		int result = 0;
		while(num>0) {
			int rem = num % 10;
			result = (result*10) + rem;
			num = num / 10;
		}
		return result;
	}
	public static String palindrome(String str) {
//		boolean flag = true;
		int start = 0 ;
		int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start)!=str.charAt(end)) {
//				flag = false;
				return null;
			}
			start++;
			end--;
		}
//		if(flag == true) {
//		}
		return str;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		do {
			System.out.println("0.Exit\n1.Integer\n2.String\n3.Array");
			System.out.println("Enter your choice: ");
			 choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Ya parat :)");
				break;
			case 1:
				System.out.println("Enter a number(INT): ");
				int num = sc.nextInt();
				
				int result = palindrome(num);
				if(result == num) {
					System.out.println("Number is palindorme.");
				}
				else {
					System.out.println("Number is not palidrome.");
				}
				break;
			case 2:
				System.out.println("Enter a number(String): ");
				String str = sc.next();
				
				String resultString = palindrome(str);
				if(resultString != null) {
					System.out.println("Number is palindorme.");
				}
				else {
					System.out.println("Number is not palidrome.");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Enter correct choice!!!");
				break;
			}
		}while(choice!=0);
		
	}

}
