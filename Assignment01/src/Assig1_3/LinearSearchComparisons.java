package Assig1_3;
import java.util.Scanner;
public class LinearSearchComparisons {
	public static int linearSearch(int arr[],int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			count++;
			if(arr[i] == key) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,20,40,30,80,50};
		System.out.println("Enter a key want to find: ");
		int key = sc.nextInt();
		int result = linearSearch(arr, key);
		System.out.print("Number of comparison required : "+result);
	}

}
